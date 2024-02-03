public class Array_Operation {
    public static void main(String[] args) {
        // int [] marks = {1,23,4,3,4,0};
        float [] marks = {1,23,4,3.2f,4,0};
        System.out.println(marks[3]);
        System.out.println(marks.length);

        /*Displaying an array
        for (int i=0; i<marks.length; i++)
            System.out.println(marks[i]);
        */
        
        //Another way of printing the element
        for (float element: marks)
        System.out.println(element);
    }

}
