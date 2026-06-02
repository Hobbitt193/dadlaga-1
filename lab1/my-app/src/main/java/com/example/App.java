public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        cub cube = new cub(a);

        System.out.println(cube.getVolume() + " " + cube.getSurfaceArea());

        sc.close();
    }dayanaaaa mal sda 
}