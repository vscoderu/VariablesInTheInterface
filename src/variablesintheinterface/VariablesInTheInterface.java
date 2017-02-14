package variablesintheinterface;

public class VariablesInTheInterface implements IConst {

    public static void main(String[] args) {
        double radius = 4.5;
        double area = PI * radius * radius;
        System.out.println("Площадь круга равна: " + area);
        
        System.out.println();
        
        for(int m = MIN; m <= MAX; m++)
            System.out.println("Сила тяжести для тела массой " + m + " кг = " +
                    (m * g) + " Н");
    }
    
}