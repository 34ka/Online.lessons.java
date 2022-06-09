package lesson18.easyMock;

import org.w3c.dom.Document;

public class UnderClass implements IListener {
    @Override
    public void docAdded(Document d) {

    }

    @Override
    public void docDeleted(Document d) {

    }

    public void addDocument(IListener mock) {
        //actions
    }
}
