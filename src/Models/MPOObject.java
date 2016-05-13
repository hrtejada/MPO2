package Models;
import Database.ProjectManager;
import java.util.LinkedHashMap;
/**
 * Created by Beto on 5/11/16.
 */

public class  MPOObject {

        private LinkedHashMap <String, Object> elements = new LinkedHashMap <String, Object>();

        public LinkedHashMap<String, Object> getElements() {
            return elements;
        }

        public void setElements(LinkedHashMap<String, Object> elements) {
            this.elements = elements;
        }

}
