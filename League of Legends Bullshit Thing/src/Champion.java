import java.util.*;
public class Champion 
{
private String name;
private String type;
private String ult;
private int hp;
private String secondType;
private int mana;
private String passive;
private String qAbil;
private String wAbil;
private String eAbil;
private String nickname;
private String pic;
static ArrayList<Champion> champs = new ArrayList<Champion>();

    public Champion(String n, String t, String r, int h, String st, int m, String p, String q, String w, String e, String nn, String pc)
        {
        name = n;
        type = t;
        ult = r;
        hp = h;
        secondType = st;
        mana = m;
        passive = p;
        qAbil = q;
        wAbil = w;
        eAbil = e;
        nickname = nn;
        pic = pc;
        }

    public String getPic()
		{
		return pic;
		}

	public void setPic(String pic)
		{
		this.pic = pic;
		}

	public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public String getqAbil() {
        return qAbil;
    }

    public void setqAbil(String qAbil) {
        this.qAbil = qAbil;
    }

    public String getwAbil() {
        return wAbil;
    }

    public void setwAbil(String wAbil) {
        this.wAbil = wAbil;
    }

    public String geteAbil() {
        return eAbil;
    }

    public void seteAbil(String eAbil) {
        this.eAbil = eAbil;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUlt() {
        return ult;
    }

    public void setUlt(String ult) {
        this.ult = ult;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
    public static ArrayList makeChamps()
        {
        champs.add(new Champion("Malzahar" , "Mage" , "Nether Grasp" , 1874 , "Assassin" , 1091 , "Summon Voidling" , "Call of the Void" , "Null Zone" , "Malefic Visions" , "Prophet of the Void" , "p.jpg"));
        champs.add(new Champion("Aatrox" , "Fighter" , "Massacre" , 1983 , "Tank" , 0 , "Blood Well" , "Dark Flight" , "Blood Thirst OR Blood Price" , "Blades of Torment" , "The Darkin Blade" , "p.jpg"));
        champs.add(new Champion("Ahri" , "Mage" , "Spirit Rush" , 1874 , "Assassin" , 1184 , "Essence Theft" , "Orb of Deception" , "Fox-Fire" , "Charm" , "The Nine-Tailed Fox" , "p.jpg"));
        champs.add(new Champion("Akali" , "Assassin" , "Shadow Dance" , 2033 , "" , 0 , "Twin Disciplines" , "Mark of the Assassin" , "Twilight Shroud" , "Crescent Slash" , "The Fist of Shadow" , "p.jpg"));
        champs.add(new Champion("Alistar" , "Tank" , "Unbreakable Will" , 2347 , "" , 925 , "Trample" , "Pulverize" , "Headbutt" , "Triumphant Roar" , "The Minotaur", "p.jpg"));
        champs.add(new Champion("Amumu" , "Tank" , "Curse of the Sad Mummy" , 2041 , "Mage" , 967 , "Cursed Touch" ,"Bandage Toss" , "Despair" , "Tantrum" , "The Sad Mummy" , "p.jpg"));
        champs.add(new Champion("Anivia" , "Mage" , "Glacial Storm" , 1658 , "Support" , 1247 , "Rebirth" , "Flash Frost" , "Crystallize" , "Frostbite" , "The Cryophoenix" , "p.jpg"));
        champs.add(new Champion("Annie" , "Mage" , "Summon: Tibbers" , 1804 , "" , 1184 , "Pyromania" , "Disintegrate" , "Incinerate" , "Molten Shield" , "The Dark Child" , "p.jpg"));
        champs.add(new Champion("Ashe" , "Marksman" , "Enchanted Crystal Arrow" , 1871 , "Support" , 827 , "Focus" , "Frost Shot" , "Volley" , "Hawkshot" , "The Frost Archer" , "p.jpg"));
        champs.add(new Champion("Azir" , "Mage" , "Emperor's Divide" , 1884 , "Marksman" , 1065 , "Shurima's Legacy" , "Conquering Sands" , "Arise!" , "Shifting Sands" , "The Emperor of the Sands" , "p.jpg"));
        champs.add(new Champion("Blitzcrank" , "Tank" , "Static Field" , 2198 , "Fighter" , 947 , "Mana Barrier" , "Rocket Grab" , "Overdrive" , "Power Fist" , "The Great Steam Golem" , "p.jpg"));
        champs.add(new Champion("Brand" , "Mage" , "Pyroclasm" , 1800 , "" , 1091 , "Blaze" , "Sear" , "Pillar of Flame" , "Conflagration" , "The Burning Vengeance" , "p.jpg"));
        champs.add(new Champion("Braum" , "Support" , "Glacial Fissure" , 2055 , "Tank" , 1076 , "Concussive Blows" , "Winter's Bite" , "Stand Behind Me" , "Unbreakable" , "The Heart of the Freljord" , "p.jpg"));
        champs.add(new Champion("Caitlyn" , "Marksman" , "Ace in the Hole" , 1884 , "" , 909 , "Headshot" , "Piltover Peacemaker" , "Yordle Snap Trap" , "90 Caliber Net" , "The Sheriff of Piltover" , "p.jpg"));
        champs.add(new Champion("Cassiopeia" , "Mage" , "Petrifying Gaze" , 1781 , "" , 1391 , "Aspect of the Serpent" , "Noxius Blast" , "Miasma" , "Twin Fang" , "The Serpent's Embrace" , "p.jpg"));
        champs.add(new Champion("Cho'Gath" , "Tank" , "Feast" , 1934 , "Mage" , 952 , "Carnivore" , "Rupture" , "Feral Scream" , "Vorpal Spikes" , "The Terror of the Void" , "p.jpg"));
        champs.add(new Champion("Corki" , "Marksman" , "Missile Barrage" , 1907 , "" , 934 , "Hextech Shrapnel Shells" , "Phosphorus Bomb" , "Valkyrie" , "Gatling Gun" , "The Daring Bombadier" , "p.jpg"));
        champs.add(new Champion("Darius" , "Fighter" , "Noxian Guillotine" , 2163 , "Tank" , 901 , "Hemorrhange" , "Decimate" , "Crippling Strike" , "Apprehend" , "The Hand of Noxus" , "p.jpg"));
        champs.add(new Champion("Diana" , "Fighter" , "Lunar Rush" , 2119 , "Mage" , 977 , "Moonsilver Blade" , "Crescent Strike" , "Pale Cascade" , "Moonfall" , "Scorn of the Moon" , "p.jpg"));
        champs.add(new Champion("Dr. Mundo" , "Fighter" , "Sadism" , 2096 , "Tank" , 0 , "Adrenaline Rush" , "Infected Cleaver" , "Burning Agony" , "Masochism" , "The Madman of Zaun" , "p.jpg"));
        champs.add(new Champion("Draven" , "Marksman" , "Whirling Death" , 1952 , "" , 1025 , "League of Draven" , "Spinning Axe" , "Blood Rush" , "Stand Aside" , "The Glorius Executioner" , "p.jpg"));
        champs.add(new Champion("Elise" , "Mage" , "Spider Form / Human Form" , 1889 , "Fighter" , 1174 , "Spider Swarm" , "Neurotoxin OR Venomous Bite" , "Volatile Spiderling OR Skittering Frenzy" , "Cocoon OR Rappel" , "The Spider Queen" , "p.jpg"));
        champs.add(new Champion("Evelynn" , "Assassin" , "Agony's Embrace" , 2061 , "Mage" , 1031 , "Shadow Walk" , "Hate Spike" , "Dark Frenzy" , "Ravage" , "The Widowmaker" , "p.jpg"));
        champs.add(new Champion("Ezreal" , "Marksman" , "Trueshot Barrage" , 1844 , "Mage" , 1076 , "Rising Spell Force" , "Mystic Shot" , "Essence Flux" , "Arcane Shift" , "The Prodigal Explorer" , "p.jpg"));
        champs.add(new Champion("Fiddlesticks" , "Mage" , "Crowstorm" , 1884 , "Support" , 1353 , "Dread" , "Terrify" , "Drain" , "Dark Wind" , "The Harbinger of Doom" , "p.jpg"));
        champs.add(new Champion("Fiora" , "Fighter" , "Blade Waltz" , 2038 , "Assassin" , 967 , "Duelist" , "Lunge" , "Riposte" , "Burst of Speed" , "The Grand Duelist" , "p.jpg"));
        champs.add(new Champion("Fizz" , "Assassin" , "Chum of the Waters" , 2020 , "Fighter" , 947 , "Nimble Fighter" , "Urchin Strike" , "Seastone Trident" , "Playful AND/OR Trickster" , "The Tidal Trickster" , "p.jpg"));
        champs.add(new Champion("Galio" , "Tank" , "Idol of Durand" , 2023 , "Mage" , 1169 , "Runic Skin" , "Resolute Smite" , "Bulwark" , "Righteous Gust" , "The Sentinel's Sorrow" , "p.jpg"));
        champs.add(new Champion("Gangplank" , "Fighter" , "Cannon Barrage" , 2008 , "Support" , 962 , "Grog Soaked Blade" , "Parrrley" , "Remove Scurvy" , "Raise Morale" , "The Saltwater Scourge" , "p.jpg"));
        champs.add(new Champion("Garen" , "Fighter" , "Demacian Justice" , 2248 , "Tank" , 0 , "Perseverance" , "Decisive Strike" , "Courage" , "Judgement" , "The Might of Demacia" , "p.jpg"));
        champs.add(new Champion("Gnar" , "Fighter" , "GNAR!" , 1645 , "Marksman" , 0 , "Rage Gene" , "Boomerang Throw OR Boulder Toss" , "Hyper OR Wallop" , "Hop OR Crunch" , "The Missing Link" , "p.jpg"));
        champs.add(new Champion("Teemo" , "Marksman" , "Noxious Trap" , 1910 , "Assassin" , 947 , "Camouflage" , "Blinding Dart" , "Move Quick" , "Toxic Shot" , "The Swift Scout" , "p.jpg"));
        champs.add(new Champion("Tristana"  , "Marksman" , "Buster Shot" , 1937 , "Assassin" , 791 , "Draw a Bead" , "Rapid Fire" , "Rocket Jump" , "Explosive Charge" , "The Yordle Gunner" , "p.jpg"));
        champs.add(new Champion("Rek'Sai" , "Fighter" , "Void Rush" , 2141 , "" , 0 , "Fury of the Xer'Sai" , "Queesn's Wrath OR Prey Seeker" , "Burrow OR Unburrow" , "Furious Bite OR Tunnel" , "The Void Burrower" , "p.jpg"));
        champs.add(new Champion("Vel'Koz" , "Mage" , "Lifeform Disintegration Ray" , 1800 , "" , 1091 , "Organic Deconstruction" , "Plasma Fission" , "Void Rift" , "Tectonic Disruption" , "The Eye of the Void" , "p.jpg"));
        champs.add(new Champion("Gragas" , "Fighter" , "Explosive Cask" , 2097 , "Mage" , 1099 , "Happy Hour" , "Barrel Roll" , "Drunken Rage" , "Body Slam" , "The Rabble Rouser" , "p.jpg"));
        champs.add(new Champion("Graves" , "Marksman" , "Collateral Damage" , 1979 , "" , 1002 , "True Grit" , "Buckshot" , "Smoke Screen" , "Quickdraw" , "The Outlaw" , "p.jpg"));
        champs.add(new Champion("Hecarim" , "Fighter" , "Onslaught of Shadows" , 2215 , "Tank" , 957 , "Warpath" , "Rampage" , "Spirit of Dread" , "Devastating Charge" , "The Something or Other" , "p.jpg"));
        champs.add(new Champion("Heimerdinger" , "Mage" , "UPGRADE!!!" , 1751 , "Support" , 987 , "Techmaturgical Repair Bots" , "H-28G Evolution Turret OR H-28Q Apex Turret" , "Hextech Micro-Rockets OR Hextech Rocket Swarm" , "CH-2 Electron Storm Grendae OR CH-3X Lightning Grenade" , "The Revered Inventor" , "p.jpg"));
        champs.add(new Champion("Irelia" , "Fighter" , "Transcendent Blades" , 2137 , "Assassin" , 884 , "Ionian Fervor" , "Bladesurge" , "Hiten Style" , "Equilibrium Strike" , "The Will of the Blades" , "p.jpg"));
        champs.add(new Champion("Janna" , "Support" , "Monsoon" , 1813 , "Mage" , 1498 , "Tailwind" , "Hawling Gale" , "Zephyr" , "Eye of the Storm" , "The Storm's Fury" , "p.jpg"));
        champs.add(new Champion("Jarvan IV" , "Tank" , "Cataclysm" , 2101 , "Fighter" , 982 , "Martial Cadence" , "Dragon Strike" , "Golden Aegis" , "Demacian Standard" , "The Exemplar of Demacia" , "p.jpg"));
        champs.add(new Champion("Jax" , "Fighter" , "Grandmaster's Might" , 2038 , "Assassin" , 884 , "Relentless Assault" , "Leap Strike" , "Empower" , "Counter Strike" , "Grandmaster at Arms" , "p.jpg"));
        champs.add(new Champion("Jayce" , "Fighter" , "Transform: Mercury Cannon OR Transform: Mercury Hammer" , 2101 , "Marksman" , 987 , "Hextech Capacitor" , "To The Skies! OR Shock Blast" , "Lightning Field OR Hyper Charge" , "Thundering Blow OR Acceleration Gate" , "The Defender of Tomorrow" , "p.jpg"));
        champs.add(new Champion("Jinx" , "Marksman" , "Super Mega Death Rocket" , 1912 , "" , 1011 , "Get Excited" , "Switcheroo!" , "Zap!" , "Flame Chompers!" , "The Loose Cannon" , "p.jpg"));
        champs.add(new Champion("Kalista" , "Marksman" , "Fate's Call" , 1929 , "" , 827 , "Martial Poise" , "Pierce" , "Sentinel" , "Rend" , "The Spear of Vengeance" , "p.jpg"));
        champs.add(new Champion("Karma" , "Mage" , "Mantra" , 1933 , "Support" , 1224 , "Gathering Fire" , "Inner Flame OR Soulflare" , "Focused Resolve OR Renewal" , "Inspire OR Defiance" , "The Enlightened One" , "p.jpg"));
        champs.add(new Champion("Karthus" , "Mage" , "Requiem" , 1791 , "" , 1409 , "Death Defied" , "Lay Waste" , "Wall of Pain" , "Defile" , "The Deathsinger" , "p.jpg"));
        champs.add(new Champion("Kassasdin" , "Assassin" , "Riftwalk" , 1890 , "Mage" , 1538 , "Void Stone" , "Null Sphere" , "Nether Blade" , "Force Pulse" , "The Void Walker" , "p.jpg"));
        champs.add(new Champion("Katarina" , "Assassin" , "Death Lotus" , 1919 , "Mage" , 0 , "Voracity" , "Bouncing Blades" , "Sinister Steel" , "Shunpo" , "The Sinister Blade" , "p.jpg"));
        champs.add(new Champion("Kayle" , "Fighter" , "Intervention" , 2155 , "Support" , 1002 , "Holy Fervor" , "Reckoning" , "Divine Blessing" , "Righteous Fury" , "The Judicator" , "p.jpg"));
        champs.add(new Champion("Kennen" , "Mage" , "Slicing Maelstrom" , 1879 , "Marksman" , 0 , "Mark of the Storm" , "Thundering Shuriken" , "Electrical Surge" , "Lightning Rush" , "The Heart of the Tempest" , "p.jpg"));
        champs.add(new Champion("Kha'Zix" , "Assassin" , "Void Assault OR Evolved Active Camouflage" , 2018 , "Fighter" , 1007 , "Unseen Threat" , "Taste Their Fear OR Evolved Enlarged Claws" , "Void Spike OR Evolved Spike Racks" , "Leap OR Evolved Wings" , "The Voidreaver" , "p.jpg"));
        champs.add(new Champion("Kog'Maw" , "Marksman" , "Living Artillery" , 2025 , "Mage" , 1002 , "Icathian Surprise" , "Caustic Spittle" , "Bio-Arcane Barrage" , "Void Ooze" , "The Mouth of the Abyss" , "p.jpg"));
        champs.add(new Champion("Twisted Fate" , "Mage" , "Destiny AND Gate" , 1916 , "" , 912 , "Loaded Dice" , "Wild Cards" , "Pick A Card" , "Stacked Deck" , "The Card Master" , "p.jpg"));
        champs.add(new Champion("Soraka" , "Support" , "Wish" , 1933 , "" , 1431 , "Salvation" , "Starcall" , "Astral Infusion" , "Equinox" , "The Starchild" , "p.jpg"));
        Collections.sort(champs, new ChampionSorter());
        return champs;
        }
     
    public static ArrayList printChamp()
        {
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < champs.size(); i++) 
            {
            System.out.println("Champion name: " + ((Champion) champs.get(i)).getName() + ", " + ((Champion) champs.get(i)).getNickname());
            System.out.println("Primary Role: " +((Champion) champs.get(i)).getType());
            System.out.println("Secondary Role: " + ((Champion) champs.get(i)).getSecondType());
            System.out.println("Health: " + ((Champion) champs.get(i)).getHp());
            System.out.println("Mana: " + ((Champion) champs.get(i)).getMana());
            System.out.println("Passive: " + ((Champion) champs.get(i)).getPassive());
            System.out.println("'Q' Ability: " + ((Champion) champs.get(i)).getqAbil());
            System.out.println("'W' Ability: " + ((Champion) champs.get(i)).getwAbil());
            System.out.println("'E' Ability: " + ((Champion) champs.get(i)).geteAbil());
            System.out.println("Ultimate: " + ((Champion) champs.get(i)).getUlt());
            int wait = userInput.nextInt();
            }
        return champs;
        }
    
}