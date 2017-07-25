package com.test.accountInfo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by Travis Brindley on 7/23/2017.
 */
public class UserFactory {


    public void addUser() {

    }



    public void addUser(String firstName, String lastName, String userName, String Password) {
/*        try {
            //source for most of the code:  https://www.mkyong.com/java/how-to-create-xml-file-in-java-dom/

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            //Creates root
            Document doc = dBuilder.newDocument();
            Element root = doc.createElement("grandCircus");
            doc.appendChild(root);

            //Lists players
            Element staff = doc.createElement("staff");
            root.appendChild(staff);

                for (int i = 0; i < staff.getLength(); i++) {
                String number;
                number = Integer.toString(i);
                staff.setAttribute("id", number);

                //Stores player name  (get from teamRoster[i])
                Element playerName = doc.createElement("playerName");
                playerName.appendChild(doc.createTextNode(teamRoster[i]));
                player.appendChild(playerName);

                for (int j = 0; j < teamStats[i].length; j++) {
                    String AtBatNumber = "AB";
                    AtBatNumber += Integer.toString(j);

                    String AtBatResult;
                    AtBatResult = Integer.toString(teamStats[i][j]);
                    //at bat results from teamStats[i][j]
                    Element atBat = doc.createElement(AtBatNumber);
                    atBat.appendChild(doc.createTextNode(AtBatResult));
                    player.appendChild(atBat);
                }
            //write the results into xml file
            TransformerFactory tfFactory = TransformerFactory.newInstance();
            Transformer transformer = tfFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("SavedBaseballRoster.xml"));

            transformer.transform(source, result);

            System.out.println("File Saved!");
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }*/
    }

    public static Users Read(String username, String password) {
        try {
            File xmlFile = new File("passwordFile.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xmlFile);
            NodeList node = doc.getElementsByTagName("staff"); // Node list is the sub grouping people belong in

            for (int i = 0; i < node.getLength(); i++) {
                String user = doc.getElementsByTagName("username").item(i).getTextContent();
                String pass = doc.getElementsByTagName("password").item(i).getTextContent();
                String fName = doc.getElementsByTagName("firstname").item(i).getTextContent();
                String lName = doc.getElementsByTagName("lastname").item(i).getTextContent();

                if(fName == username && pass == password){
                    return new Users(fName,lName,user,pass);
                }
            }

        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public void UpdateUser(String firstName, String lastName, String userName, String password) {

    }

    public void UpdateUser() {

    }

    public void DeleteUser() {

    }
}
