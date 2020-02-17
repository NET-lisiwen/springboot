package state;

abstract class State {
    abstract void Handle(Context context);
}
