final class SecuritySystem {
    void AuthenticateUser(String username , String password )
    {
System.out.println("Authenticated username is : "+ username);
System.out.println("Aurthenticated password is : " + password);
    }

}
class AdvancedSecurity extends SecuritySystem {
 void  AuthenticateUser(String username , String password)
    {
System.out.println("Unauthenticated");
    }
}
