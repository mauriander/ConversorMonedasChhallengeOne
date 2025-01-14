import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Principal {
    private static JComboBox<String> originCurrencyDropdown;
    private static JComboBox<String> targetCurrencyDropdown;
    private static JTextField amountField;
    private static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de Moneda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();

        JLabel originLabel = new JLabel("Elige la moneda de origen:");
        panel.add(originLabel);

        String[] currencies = {"USD", "EUR", "GBP", "ARS", "BRL", "JPY", "AUD", "CAD", "CHF", "CNY",
                "INR", "RUB", "SGD", "HKD", "ZAR", "KRW", "NZD", "MXN", "SEK", "NOK",
                "DKK", "PLN", "TRY", "THB", "ILS", "MYR", "PHP", "AED", "CLP", "COP",
                "HUF", "PKR", "UAH", "EGP", "IDR"};

        originCurrencyDropdown = new JComboBox<>(currencies);
        panel.add(originCurrencyDropdown);

        JLabel targetLabel = new JLabel("Elige la moneda de destino:");
        panel.add(targetLabel);


        targetCurrencyDropdown = new JComboBox<>(currencies);
        panel.add(targetCurrencyDropdown);

        JLabel amountLabel = new JLabel("Ingresa el valor a convertir:");
        panel.add(amountLabel);

        amountField = new JTextField(10);
        panel.add(amountField);

        JButton convertButton = new JButton("Convertir");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    convertCurrency();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultLabel.setText("Error: No se pudo convertir la moneda.");
                }
            }
        });
        panel.add(convertButton);

        resultLabel = new JLabel("Valor convertido:");
        panel.add(resultLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private static void convertCurrency() throws Exception {
        String de = (String) originCurrencyDropdown.getSelectedItem();
        String a = (String) targetCurrencyDropdown.getSelectedItem();
        double monto = Double.parseDouble(amountField.getText());

        ConsultaMoneda consulta = new ConsultaMoneda();
        TasaDeCambio tasa = consulta.buscaTasa(de, a);
        if (tasa == null) {
            throw new RuntimeException("No encontré esa moneda.");
        }
        double conversionCambio = tasa.getRate();
        double valorConvertido = monto * conversionCambio;

        resultLabel.setText("Valor convertido: " + valorConvertido);

        GeneradorDeArchivo generador = new GeneradorDeArchivo();
        generador.guardarJson(tasa);
    }
}
