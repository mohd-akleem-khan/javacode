public class Factory{
        public static AbstractDemo getInstance(){
                return new NonAbstractDemo();
        }
}
