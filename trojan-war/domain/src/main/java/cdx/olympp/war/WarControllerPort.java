package cdx.olympp.war;

import cdx.olympp.clan.Clan;

public interface WarControllerPort {

    War create(Clan greeks, Clan trojan);
}
