public class Option {
    String opText;
    int nextId;
    boolean changeGooState = false;
    boolean changeSwordState = false;

    Option(String opText, int nextId){
        this.opText = opText;
        this.nextId = nextId;
    }

    Option(String opText, int nextId, boolean changeGooState){
        this.opText = opText;
        this.nextId = nextId;
        this.changeGooState = changeGooState;
    }

    Option(String opText, int nextId, boolean changeGooState, boolean changeSwordState){
        this.opText = opText;
        this.nextId = nextId;
        this.changeGooState = changeGooState;
        this.changeSwordState = changeSwordState;
    }

    public void selected(){
        if (changeGooState) {
            boolean currentBlueGoo= StoryFlow.blueGoo;
            StoryFlow.blueGoo = !currentBlueGoo;
        }
        if (changeSwordState) {
            boolean currentSword= StoryFlow.sword;
            StoryFlow.blueGoo = !currentSword;
        }
        HomeFrame.currPage = nextId;
    }


}
