package cdx.olympp.war;

import cdx.olympp.clan.Clan;
import cdx.olympp.clan.ClanType;

public class War {

    Clan greeks;
    Clan trojans;

    public War(Clan greeks, Clan trojans) {
        if (!ClanType.GREEK.equals(greeks.getClanType()) || !ClanType.TROJAN.equals(trojans.getClanType())) {
            throw new WarException("Trojan war should have both a valid Greek clan and a Trojan clan.");
        }
        this.greeks = greeks;
        this.trojans = trojans;
    }
}
