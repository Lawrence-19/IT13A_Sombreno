import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class JobApplicationFrame extends JFrame {

    private JTextField nameField, emailField, phoneField, portfolioField, startDateField;
    private JTextArea coverLetterArea;
    private JLabel resumeLabel;
    private File resumeFile;

    public JobApplicationFrame(String jobTitle, String companyName) {
        setTitle("Apply for " + jobTitle);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Header
        JLabel headerLabel = new JLabel("Apply for " + jobTitle + " at " + companyName);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(headerLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Input fields
        nameField = new JTextField(30);
        emailField = new JTextField(30);
        phoneField = new JTextField(30);
        portfolioField = new JTextField(30);
        startDateField = new JTextField(20);
        coverLetterArea = new JTextArea(5, 30);
        resumeLabel = new JLabel("No file chosen");

        addField(panel, "Full Name:", nameField);
        addField(panel, "Email Address:", emailField);
        addField(panel, "Phone Number:", phoneField);
        addField(panel, "Portfolio URL (optional):", portfolioField);
        addField(panel, "Available Start Date:", startDateField);

        panel.add(new JLabel("Cover Letter / Message:"));
        panel.add(new JScrollPane(coverLetterArea));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Resume upload
        JButton uploadButton = new JButton("Upload Resume");
        uploadButton.addActionListener(e -> chooseResumeFile());
        panel.add(uploadButton);
        panel.add(resumeLabel);

        // Submit/Cancel
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit Application");
        JButton cancelButton = new JButton("Cancel");

        submitButton.addActionListener(e -> handleSubmit(jobTitle, companyName));
        cancelButton.addActionListener(e -> dispose());

        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        panel.add(buttonPanel);

        add(new JScrollPane(panel));
        setVisible(true);
    }

    private void addField(JPanel panel, String label, JTextField field) {
        JPanel fieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel.add(new JLabel(label));
        fieldPanel.add(field);
        panel.add(fieldPanel);
    }

    private void chooseResumeFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION) {
            resumeFile = fileChooser.getSelectedFile();
            resumeLabel.setText("Selected: " + resumeFile.getName());
        }
    }

    private void handleSubmit(String jobTitle, String companyName) {
        if(nameField.getText().isEmpty() || emailField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name and Email are required.", "Missing Info", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Simulate sending application
        JOptionPane.showMessageDialog(this,
                "Application for " + jobTitle + " at " + companyName + " submitted successfully!",
                "Application Sent",
                JOptionPane.INFORMATION_MESSAGE);
        dispose(); // Close window
    }

    public static void main(String[] args) {
        // Example usage
        SwingUtilities.invokeLater(() -> new JobApplicationFrame("Frontend Developer", "TechNova Inc."));
    }
}