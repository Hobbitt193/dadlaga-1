public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        Cub cube = new Cub(a);

        System.out.println(cube.getVolume() + " " + cube.getSurfaceArea());

        sc.close();
    }
}