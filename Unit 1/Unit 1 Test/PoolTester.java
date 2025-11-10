public class PoolTester {
    public static void main(String[] args) {
        Pool pool1 = new Pool("happy pool", "    shriya     vishwas", 11);
        System.out.println(pool1.toString());
        Pool pool2 = new Pool("happy pool", "shriya vishwas", 10);
        pool2.setCleanlinessLevel(0);
        PoolUtils.cleanPool(pool2);
        System.out.println(pool2);
        pool2.setUsername(pool1.getUsername());
        System.out.println(pool1.equals(pool2));

    }
}