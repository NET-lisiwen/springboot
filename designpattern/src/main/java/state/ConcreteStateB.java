package state;

public class ConcreteStateB extends  State{
    @Override
    void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
