public class Calculate {
        public static void main(String[] args){
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);

            if(args[0].equals("somar")){
                sun(x, y);
            } else if (args[0].equals("subtrair")){
                minus(x, y);
            } else {
                System.out.println("Nenhuma instrução definida");
            }
        }

        static void sun(int x, int y){
            System.out.println(x + y);
        }
        static void minus(int x, int y){
            System.out.println(x - y);
        }
}

