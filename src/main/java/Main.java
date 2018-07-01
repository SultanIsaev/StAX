import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){

        try(StaxStreamProcessor processor = new StaxStreamProcessor(
                Files.newInputStream(Paths.get("/home/ghost/IdeaProjects/StAX/src/main/resources/payload.xml"))))
        {
            while (processor.startElement("City", "Cities"))
            {
                System.out.println(processor.getAttribute("id") +":" + processor.getText());
            }
            }catch (IOException | XMLStreamException e){
                e.printStackTrace();
        }
    }
}