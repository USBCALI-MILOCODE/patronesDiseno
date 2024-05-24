public class User {
  private State currentState;
  private boolean isBuying;
  private boolean isEnable;

  public User() {
    this.currentState = new ActiveState(this); // El estado inicial es Active
    this.isBuying = false;
    this.isEnable = true;
  }

  public void changeState(State state) {
    this.currentState = state;
  }

  public String onActive() {
    return currentState.onActive();
  }

  public String onDisable() {
    return currentState.onDisable();
  }

  public String onLock() {
    return currentState.onLock();
  }

  public String onBuy() {
    return currentState.onBuy();
  }

  public boolean isBuying() {
    return isBuying;
  }

  public void setBuying(boolean buying) {
    isBuying = buying;
  }

  public boolean getEnable() {
    return isEnable;
  }

  public void setEnable(boolean enable) {
    isEnable = enable;
  }

  public String startBuy() {
    if (isEnable) {
      isBuying = true;
      return "Starting to buy...";
    }
    return "Cannot buy, card is disabled.";
  }
}
