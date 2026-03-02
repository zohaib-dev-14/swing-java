package CV_SWING;
import javax.swing.*;
import java.awt.*;

public class CV_IN_SWING {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Muhammad Zohaib - CV");

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        textArea.setText(
                "Muhammad Zohaib\n" +
                "Islamabad, Pakistan\n" +
                "Phone: 03026102243\n" +
                "GitHub: https://github.com/zohaib-dev-14\n" +
                "LinkedIn: https://linkedin.com/in/muhammadzohaib14\n\n" +

                "--------------------------------------------\n" +
                "PROFESSIONAL SUMMARY\n" +
                "Software Engineering student focused on Flutter, Node.js,\n" +
                "REST APIs, JWT Authentication, and Clean Architecture.\n\n" +

                "--------------------------------------------\n" +
                "TECHNICAL SKILLS\n" +
                "Languages: C++, Java, Dart, JavaScript\n" +
                "Frontend: Flutter (Riverpod, Provider)\n" +
                "Backend: Node.js, Express, MongoDB\n" +
                "Tools: Git, GitHub, Jira\n" +
                "Concepts: DSA, OOP, Clean Architecture\n\n" +

                "--------------------------------------------\n" +
                "PROJECTS\n" +
                "1. Weather App (Flutter + Riverpod)\n" +
                "2. Notes App (Flutter + Provider)\n" +
                "3. Quran App (Flutter + REST API)\n" +
                "4. Node.js REST API with JWT & RBAC\n\n" +

                "--------------------------------------------\n" +
                "EDUCATION\n" +
                "BS Software Engineering\n" +
                "University of Mianwali (3rd Year)\n"
        );

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


