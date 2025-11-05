import java.util.ArrayList;
import java.util.List;
public class DynamicUserGroupCallback implements UserGroupCallback {


    public boolean existsUser(String userId) {
        return true; // or validate against your user store
    }


    public boolean existsGroup(String groupId) {
        return true; // or validate against your group store
    }

 
    public List<String> getGroupsForUser(String userId) {
        // Example: fetch from DB or LDAP
        List<String> userGroups = new ArrayList<String>();
        userGroups.add("HR");
        userGroups.add("IT");
        System.out.println("userGroups:"+userGroups);
        return userGroups;
    }
}