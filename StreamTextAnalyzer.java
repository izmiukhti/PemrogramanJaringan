package PemrogramanJaringan;

import java.awt.*;
import javax.swing.*;

public class StreamTextAnalyzer extends JFrame {
    // Deklarasi komponen GUI
    private JTextArea textArea;
    private JLabel lineCountLabel, wordCountLabel, charCountLabel;
    private JTextField filePathField;
    private JButton browseButton;

    public StreamTextAnalyzer() {
        setTitle("Erinthia Dinda Pratiwi & Izmi Ukhti - Text Application");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel untuk input file
        JPanel filePanel = new JPanel(new BorderLayout());
        filePathField = new JTextField("input your text file");
        filePathField.setEditable(false);
        browseButton = new JButton("Browse");

        filePanel.add(filePathField, BorderLayout.CENTER);
        filePanel.add(browseButton, BorderLayout.EAST);

        // Area teks untuk menampilkan isi file
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Panel informasi
        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        lineCountLabel = new JLabel("Line: 0 lines");
        wordCountLabel = new JLabel("Word: 0 words");
        charCountLabel = new JLabel("Character: 0 characters");

        infoPanel.add(lineCountLabel);
        infoPanel.add(wordCountLabel);
        infoPanel.add(charCountLabel);

        add(filePanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(infoPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StreamTextAnalyzer app = new StreamTextAnalyzer();
            app.setVisible(true);
        });
    }
}
