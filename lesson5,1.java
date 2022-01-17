public static void main(String[] args) {
        numbers2();
        numbers3();

       
    /*5*) Есть массив заполненный случайными числами. Создать массив в 2 раза больше исходного и продублировать
    в нем исходный 2 раза, но второй раз в обратном порядке, например [1,2,3] => [1,2,3,3,2,1]
     */

    private static void numbers2() {

        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr.length);


        int size = arr.length;
        int j = 0;
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
            System.out.println(Arrays.toString(arr));
        }
    } private static void numbers3(){

        int[] arr;
        arr = new int[10];
        int temp = arr.length;
        int[] c = new int[arr[5] + arr.length];
        int count = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
                c[i] = arr[i];
                count++;
            }
        int j;
        for (j = 0; !(j >= temp); j++) {
                c[count++] = arr[j];
            }
            for (i = 0; i < c.length; i++)
                System.out.print(c[i] + " ");
        }
    }


