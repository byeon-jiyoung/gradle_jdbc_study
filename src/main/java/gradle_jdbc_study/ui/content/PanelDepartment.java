package gradle_jdbc_study.ui.content;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import gradle_jdbc_study.dto.Department;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelDepartment extends JPanel {
	private JTextField tfDeptNo;
	private JTextField tfDeptName;
	private JTextField tfFloor;

	/**
	 * Create the panel.
	 */
	public PanelDepartment() {
		initComponents();
	}
	
	private void initComponents() {
		setBorder(new TitledBorder(null, "부서관리", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblDeptNo = new JLabel("부서번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		add(tfDeptNo);
		tfDeptNo.setColumns(10);
		
		JLabel lblDeptName = new JLabel("부서명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		tfDeptName.setColumns(10);
		add(tfDeptName);
		
		JLabel lblFloor = new JLabel("층");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		tfFloor.setColumns(10);
		add(tfFloor);
	}
	
	public void setDepartment(Department deparment) {
		tfDeptNo.setText(deparment.getDeptNo()+"");
		tfDeptName.setText(deparment.getDeptName());
		tfFloor.setText(deparment.getFloor()+"");
	}
	
	public Department getDepartmnet() {
		int deptNo = Integer.valueOf(tfDeptNo.getText().trim());
		String deptName = tfDeptName.getText().trim();
		int floor = Integer.valueOf(tfFloor.getText().trim());
		
		return new Department(deptNo, deptName, floor);
	}
	
	public void clearTf() {
		tfDeptNo.setText("");
		tfDeptName.setText("");
		tfFloor.setText("");
	}
}
