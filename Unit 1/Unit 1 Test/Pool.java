public class Pool {
    String name;
    String ownerName;
    String username;
    int cleanlinessLevel;
    boolean needsChemicalCheck;

    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);
        this.username = PoolUtils.generateUsername(PoolUtils.fixName(ownerName));
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsChemicalCheck = false;
    }

    public Pool() {
        this.name = "Big Pool";
        this.ownerName = "Bobby pool";
        this.username = PoolUtils.generateUsername(PoolUtils.fixName(ownerName));
        this.cleanlinessLevel = 9;
        this.needsChemicalCheck = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public String toString() {
        if (this.needsChemicalCheck) {
            return "== ABOUT POOL ==\n" 
                + "Name: " + name + "\n" 
                + "Owner: " + ownerName + "\n"
                + "Username: " + username + "\n" 
                + "Cleanliness Level: " + cleanlinessLevel + "\n" 
                + "Does pool need chemical check? Yes";
        } else {
            return "== ABOUT POOL ==\n" 
                + "Name: " + name + "\n" 
                + "Owner: " + ownerName + "\n"
                + "Username: " + username + "\n" 
                + "Cleanliness Level: " + cleanlinessLevel + "\n" 
                + "Does pool need chemical check? No";
        }
    } 

    public boolean equals(Pool otherPool) {
        if (this.name.equals(otherPool.name) 
            && this.ownerName.equals(otherPool.ownerName) 
            && this.username.equals(otherPool.username) 
            && this.cleanlinessLevel == otherPool.cleanlinessLevel 
            && this.needsChemicalCheck == otherPool.needsChemicalCheck) {
            return true;
        } else {
            return false;
        }
    }
}