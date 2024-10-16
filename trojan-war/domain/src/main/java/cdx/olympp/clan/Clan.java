package cdx.olympp.clan;

import cdx.olympp.infantry.InfantryMan;

import java.util.ArrayList;
import java.util.List;

public class Clan {
    ClanType clanType;
    List<InfantryMan> army = new ArrayList<>();

    public Clan(ClanType clanType, List<InfantryMan> army) {
        this.clanType = clanType;
        this.army = army;
    }

    public List<InfantryMan> getArmy() {
        return army;
    }

    public void setArmy(List<InfantryMan> army) {
        this.army = army;
    }

    public ClanType getClanType() {
        return clanType;
    }

    public void setClanType(ClanType clanType) {
        this.clanType = clanType;
    }

}
