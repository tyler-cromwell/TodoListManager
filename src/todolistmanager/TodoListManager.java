package todolistmanager;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Tyler Cromwell
 */
public class TodoListManager extends javax.swing.JFrame {
    private final DefaultListModel listModel;

    /**
     * Creates new form TodoListManager
     */
    public TodoListManager() {
        initComponents();

        /* Finish priority initalization */
        for (Priority p : Priority.values()) {
            String name = p.name().toLowerCase();
            this.taskPriorityComboBox.addItem(name.substring(0, 1).toUpperCase() + name.substring(1));
        }
        this.taskPriorityComboBox.setSelectedIndex(Priority.NORMAL.ordinal());

        /* Finish task list initialization */
        this.listModel = (DefaultListModel) this.taskList.getModel();

        /* Finish notes initialization */
        this.taskDetailsArea.setWrapStyleWord(true);
        this.taskDetailsArea.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        taskListPanel = new javax.swing.JPanel();
        taskListLabel = new javax.swing.JLabel();
        taskButtonPanel = new javax.swing.JPanel();
        addTaskButton = new javax.swing.JButton();
        removeTaskButton = new javax.swing.JButton();
        taskListScrollPane = new javax.swing.JScrollPane();
        taskList = new javax.swing.JList<>();
        taskDetailsPanel = new javax.swing.JPanel();
        taskDetailsScrollPane = new javax.swing.JScrollPane();
        taskDetailsArea = new javax.swing.JTextArea();
        taskTitleField = new javax.swing.JTextField();
        taskTitleLabel = new javax.swing.JLabel();
        taskNotesLabel = new javax.swing.JLabel();
        taskPriorityLabel = new javax.swing.JLabel();
        taskPriorityComboBox = new javax.swing.JComboBox<>();
        taskDoneCheckBox = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To-Do List Manager");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWeights = new double[] {0.0, 1.0};
        layout.rowWeights = new double[] {1.0};
        getContentPane().setLayout(layout);

        java.awt.GridBagLayout taskListPanelLayout = new java.awt.GridBagLayout();
        taskListPanelLayout.columnWeights = new double[] {1.0};
        taskListPanelLayout.rowWeights = new double[] {0.0, 1.0, 0.0};
        taskListPanel.setLayout(taskListPanelLayout);

        taskListLabel.setText("Tasks");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        taskListPanel.add(taskListLabel, gridBagConstraints);

        taskButtonPanel.setLayout(new java.awt.GridLayout(1, 0));

        addTaskButton.setText("+");
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });
        taskButtonPanel.add(addTaskButton);

        removeTaskButton.setText("-");
        removeTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTaskButtonActionPerformed(evt);
            }
        });
        taskButtonPanel.add(removeTaskButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        taskListPanel.add(taskButtonPanel, gridBagConstraints);

        taskList.setModel(new DefaultListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
            public void setElementAt(String element, int i) { strings[i] = (String) element; }
        });
        taskList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taskList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                taskListValueChanged(evt);
            }
        });
        taskListScrollPane.setViewportView(taskList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        taskListPanel.add(taskListScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 5);
        getContentPane().add(taskListPanel, gridBagConstraints);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWeights = new double[] {0.0, 1.0};
        jPanel1Layout.rowWeights = new double[] {0.0, 0.0, 0.0, 1.0};
        taskDetailsPanel.setLayout(jPanel1Layout);

        taskDetailsArea.setColumns(20);
        taskDetailsArea.setRows(5);
        taskDetailsScrollPane.setViewportView(taskDetailsArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 10, 10);
        taskDetailsPanel.add(taskDetailsScrollPane, gridBagConstraints);

        taskTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTitleFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        taskDetailsPanel.add(taskTitleField, gridBagConstraints);

        taskTitleLabel.setText("Title:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        taskDetailsPanel.add(taskTitleLabel, gridBagConstraints);

        taskNotesLabel.setText("Notes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        taskDetailsPanel.add(taskNotesLabel, gridBagConstraints);

        taskPriorityLabel.setText("Priority:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        taskDetailsPanel.add(taskPriorityLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        taskDetailsPanel.add(taskPriorityComboBox, gridBagConstraints);

        taskDoneCheckBox.setText("Is Done?");
        taskDoneCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDoneCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        taskDetailsPanel.add(taskDoneCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(taskDetailsPanel, gridBagConstraints);

        fileMenu.setText("File");

        loadMenuItem.setText("Load");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadMenuItem);

        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        System.out.println("addTaskButtonActionPerformed: Adding a new task");
    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void removeTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTaskButtonActionPerformed
        String selected = this.taskList.getSelectedValue();

        if (selected == null) {
            JOptionPane.showMessageDialog(this, "You must select a task", "Remove Task", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("removeTaskButtonActionPerformed: Removing task: "+ this.taskList.getSelectedValue());
        }
    }//GEN-LAST:event_removeTaskButtonActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        System.out.println("saveMenuItemActionPerformed: Saving to data-store");
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        System.out.println("loadMenuItemActionPerformed: Loading from data-store");
    }//GEN-LAST:event_loadMenuItemActionPerformed

    private void taskListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_taskListValueChanged
        this.taskTitleField.setText(this.taskList.getSelectedValue());
    }//GEN-LAST:event_taskListValueChanged

    private void taskTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTitleFieldActionPerformed
        if (this.taskList.getSelectedValue() != null) {
            String title = this.taskTitleField.getText();
            int index = this.taskList.getSelectedIndex();

            this.listModel.setElementAt(title, index);
            this.taskList.setModel(this.listModel);
            this.taskTitleField.setText(title);
        } else {
            // Either add new item or display warning
        }
    }//GEN-LAST:event_taskTitleFieldActionPerformed

    private void taskDoneCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskDoneCheckBoxActionPerformed
        System.out.println("jCheckBox1ActionPerformed: Toggle done status");
    }//GEN-LAST:event_taskDoneCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TodoListManager main = new TodoListManager();
                main.setMinimumSize(
                    new Dimension(main.getPreferredSize().width,
                    main.getPreferredSize().height + 10)
                );
                main.setSize(main.getMinimumSize());
                main.pack();
                main.setVisible(true);
                main.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTaskButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton removeTaskButton;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JPanel taskButtonPanel;
    private javax.swing.JTextArea taskDetailsArea;
    private javax.swing.JPanel taskDetailsPanel;
    private javax.swing.JScrollPane taskDetailsScrollPane;
    private javax.swing.JCheckBox taskDoneCheckBox;
    private javax.swing.JList<String> taskList;
    private javax.swing.JLabel taskListLabel;
    private javax.swing.JPanel taskListPanel;
    private javax.swing.JScrollPane taskListScrollPane;
    private javax.swing.JLabel taskNotesLabel;
    private javax.swing.JComboBox<String> taskPriorityComboBox;
    private javax.swing.JLabel taskPriorityLabel;
    private javax.swing.JTextField taskTitleField;
    private javax.swing.JLabel taskTitleLabel;
    // End of variables declaration//GEN-END:variables
}