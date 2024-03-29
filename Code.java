import java.util.Arrays;
public class Code{
	public static void main(String[] args) {
		String horario = "07:45pm";
		int convertToint;
		String firstTime = horario.substring(0, 2);
		String turno = horario.substring(5, 7);
        String min_seg = horario.substring(3, 5);
		convertToint = Integer.parseInt(firstTime);
        if(convertToint < 12 && turno.equals("pm")){
            convertToint += 12;
            horario = Integer.toString(convertToint) + ":" +min_seg;
        }
        else if(convertToint == 12 && turno.equals("pm")){
            convertToint -= convertToint;
            horario = "0" + Integer.toString(convertToint) + ":00";
        }
        
         System.out.print("hour in 24 hours format: " +horario);
	}
}