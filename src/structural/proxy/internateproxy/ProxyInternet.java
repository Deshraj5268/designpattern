package structural.proxy.internateproxy;

import exception.ApplicationException;

import java.util.ArrayList;
import java.util.List;


//protection policy
public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw  new ApplicationException("Access Denied for " + serverhost);
        }

        internet.connectTo(serverhost);
    }

}
