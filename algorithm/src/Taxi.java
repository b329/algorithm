public class Taxi implements Meter {

//    @Override
    public void start() {

    };

  //  @Override
    public int stop(int distance) {
        int result = distance * 2;

        return result;
    }
}
