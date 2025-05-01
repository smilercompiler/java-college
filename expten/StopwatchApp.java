import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedSeconds = 0;

    public StopwatchApp() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        timeLabel = new JLabel("Elapsed Time: 0 s", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 22));
        timeLabel.setForeground(new Color(34, 139, 34));
        add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.setBackground(new Color(60, 179, 113)); 
        stopButton.setBackground(new Color(220, 20, 60));   
        resetButton.setBackground(new Color(70, 130, 180)); 

        startButton.setForeground(Color.WHITE);
        stopButton.setForeground(Color.WHITE);
        resetButton.setForeground(Color.WHITE);

        startButton.setFocusPainted(false);
        stopButton.setFocusPainted(false);
        resetButton.setFocusPainted(false);

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);

        timer = new Timer(1000, e -> {
            elapsedSeconds++;
            timeLabel.setText("Elapsed Time: " + elapsedSeconds + " s");
        });

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startButton) {
            if (!timer.isRunning()) {
                timer.start();
            }
        } else if (source == stopButton) {
            if (timer.isRunning()) {
                timer.stop();
            }
        } else if (source == resetButton) {
            timer.stop();
            elapsedSeconds = 0;
            timeLabel.setText("Elapsed Time: 0 s");
        }
    }

    public static void main(String[] args) {
     
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(StopwatchApp::new);
    }
}
