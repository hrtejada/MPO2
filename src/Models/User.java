package Models;
import Database.UserManager;
import java.util.LinkedHashMap;
/**
 * Created by Beto on 5/11/16.
 */

public class User {

        LinkedHashMap <String, Object> userElements = new LinkedHashMap <String, Object>();

        public User (String firstName, char middleInitial,String lastName, String organizationName,
                        String departmentName, String positionTitle, String departmentContactName, String workContactName,
                        String email, String username, String password, String userType, boolean isApproved)
        {
            userElements.put("firstName", firstName);
            userElements.put("middleInitial", middleInitial);
            userElements.put("lastName", lastName);
            userElements.put("organizationName", organizationName);
            userElements.put("departmentName", departmentName);
            userElements.put("positionTitle", positionTitle);
            userElements.put("departmentContactName", departmentContactName);
            userElements.put("workContactName", workContactName);
            userElements.put("email", email);
            userElements.put("username", username);
            userElements.put("password", password);
            userElements.put("userType", userType);
            userElements.put("isApproved", isApproved);
        }

        public boolean createAccount(String firstName, char middleInitial,String lastName,String organizationName,
                                     String departmentName, String positionTitle, String departmentContactName, String workContactName,
                                     String email, String username, String password, String userType, boolean isApproved)
        {
            User newAccount = new User(firstName,middleInitial,lastName, organizationName,
                    departmentName,positionTitle,departmentContactName, workContactName,
                    email, username, password,userType, isApproved);
            UserManager db = new UserManager();
            return db.createUser(newAccount);
        }

        public boolean deleteAccount(String username)
        {
            UserManager db = new UserManager();
            return db.deleteUser(username);
        }

        public boolean updateAccount(String username, String field, String value)
        {
            /*Code for Update goes here */
            return false;
        }

        public User verifyCredentials(String username, String password)
        {
            UserManager db = new UserManager();

            if(db.verifyCredentials(username, password))
            {
                return db.getUser(username);
            }
            return null;
        }


        public LinkedHashMap<String, Object> getUserElements() {
            return userElements;
        }

        public void setAccountElements(LinkedHashMap<String, Object> accountElements) {
            this.userElements = accountElements;
        }

}


