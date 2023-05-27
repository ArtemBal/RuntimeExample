public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();
        int availableProcessor = runtime.availableProcessors();

        StringBuffer sb = new StringBuffer();
        sb.append("Total memory: ").append(totalMemory).append(" bytes");
        System.out.println(sb);
        sb.delete(0, sb.length());
        sb.append("Free memory: ").append(freeMemory).append(" bytes");
        System.out.println(sb);
        sb.delete(0, sb.length());
        sb.append("Max memory: ").append(maxMemory).append(" bytes");
        System.out.println(sb);
        sb.delete(0, sb.length());
        sb.append("Available processors: ").append(availableProcessor);
        System.out.println(sb);
    }
}