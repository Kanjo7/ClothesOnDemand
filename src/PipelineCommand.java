import java.util.ArrayList;

public class PipelineCommand {


    private ArrayList<CommandInterface> pipeline = new ArrayList<>();

    public PipelineCommand() {
    }

    public void addInterface(CommandInterface commandInterface) {
        pipeline.add(commandInterface);
    }

    public Pants useCommand(Pants pants) {
        for (CommandInterface commandInterface : pipeline) {
            commandInterface.execute(pants);
        }
        return pants;
    }

    public Skirt useCommand(Skirt skirt) {
        for (CommandInterface commandInterface : pipeline) {
            commandInterface.execute(skirt);
        }
        return skirt;
    }

    public TShirt useCommand(TShirt tShirt) {
        for (CommandInterface commandInterface : pipeline) {
            commandInterface.execute(tShirt);
        }
        return tShirt;
    }
}
