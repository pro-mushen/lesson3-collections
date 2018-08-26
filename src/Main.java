import ru.innopolis.task3.MathBox;
import ru.innopolis.task3.WorkWithArray;

public class Main {

    public static void main(String[] args) {

        Integer[] mass;

        MathBox mathBox = new MathBox(WorkWithArray.creatArray(4));
        MathBox mathBox2 = new MathBox(WorkWithArray.creatArray(4));

        System.out.println("mathBox.toString() = " + mathBox.toString());
        System.out.println("mathBox2.toString() = " + mathBox2.toString());

        System.out.println("Сумма элементов mathBox = " + mathBox.summator());
        System.out.println("Splitter(10) = " + mathBox.splitter(10));

        mass = mathBox.getCollectionInMass();
        MathBox mathBoxSame = new MathBox(mass);

        System.out.println("mathBox.equals(mathBox2) = " + mathBox.equals(mathBox2));
        System.out.println("mathBox.equals(mathBoxSame) = " + mathBox.equals(mathBoxSame));

    }

}
