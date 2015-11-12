
import javax.swing.JOptionPane;

public class CarDriver {

	public static void main(String[] args){
		CarClass car1 = new CarClass();
		String make = JOptionPane.showInputDialog("Enter the make of car 1:");
		car1.setMake(make);
		String color = JOptionPane.showInputDialog("Enter the color of car 1:");
		car1.setColor(color);
		double horsepower = Double.valueOf(JOptionPane.showInputDialog("Enter the horse power of car 1:"));
		car1.setHorsePower(horsepower);
		double enginesize = Double.valueOf(JOptionPane.showInputDialog("Enter the engine size of car 1 in liters:"));
		car1.setEngineSize(enginesize);
		
		CarClass car2 = new CarClass();
		make = JOptionPane.showInputDialog("Enter the make of car 2:");
		car2.setMake(make);
		color = JOptionPane.showInputDialog("Enter the color of car 2:");
		car2.setColor(color);
		horsepower = Double.valueOf(JOptionPane.showInputDialog("Enter the horse power of car 2:"));
		car2.setHorsePower(horsepower);
		enginesize = Double.valueOf(JOptionPane.showInputDialog("Enter the engine size of car 2 in liters:"));
		car2.setEngineSize(enginesize);
		
		CarClass car3 = new CarClass();
		make = JOptionPane.showInputDialog("Enter the make of car 3:");
		car3.setMake(make);
		color = JOptionPane.showInputDialog("Enter the color of car 3:");
		car3.setColor(color);
		horsepower = Double.valueOf(JOptionPane.showInputDialog("Enter the horse power of car 3:"));
		car3.setHorsePower(horsepower);
		enginesize = Double.valueOf(JOptionPane.showInputDialog("Enter the engine size of car 3 in liters:"));
		car3.setEngineSize(enginesize);
		
		JOptionPane.showMessageDialog(null, car1);
		JOptionPane.showMessageDialog(null, car2);
		JOptionPane.showMessageDialog(null, car3);
	}
}