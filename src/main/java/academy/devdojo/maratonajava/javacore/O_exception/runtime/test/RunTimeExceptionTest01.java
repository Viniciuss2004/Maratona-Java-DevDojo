package academy.devdojo.maratonajava.javacore.O_exception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked

        //Não existe um objeto (NumPointerException)

        Object object = null;
        System.out.println(object.toString());

        //Não existe a segunda posição do array apenas 0 e 1 (ArrayIndexOutOfBoundsException)

        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
