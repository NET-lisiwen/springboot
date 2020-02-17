package state;

public class ConcreteStateA extends State {
    @Override
    void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
