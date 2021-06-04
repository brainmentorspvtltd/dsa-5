
public class CommonUtils {
	public String getProperName(String name) {
		String names[] = name.split(" ");
        String properName = "";
        for(String n : names) {
            properName += String.valueOf(n.charAt(0)).toUpperCase() +
            n.substring(1).toLowerCase() + " ";
        }
        return properName;
	}
	
	public String salaryFormat(double salary) {
		String formatSalary = "";
//		Local code
		return formatSalary;
	}
}
