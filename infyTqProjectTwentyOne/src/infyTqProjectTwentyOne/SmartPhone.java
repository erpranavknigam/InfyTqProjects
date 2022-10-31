package infyTqProjectTwentyOne;

public class SmartPhone extends Mobile implements Testable{
	private String networkGeneration;

	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion,
			String networkGeneration) {
		super(name, brand, operatingSystemName, operatingSystemVersion);
		this.networkGeneration = networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}
	
	public boolean testCompatibility() {
		if("Saturn".equals(getOperatingSystemName())) {
			if("3G".equals(getNetworkGeneration())){
				if("1.1".equals(super.getOperatingSystemVersion()) 
						|| "1.2".equals(super.getOperatingSystemName())
						|| "1.3".equals(super.getOperatingSystemVersion())) {
					return true;
				} else {
					return false;
				}
			} else if("4G".equals(getNetworkGeneration())) {
				if("1.2".equals(super.getOperatingSystemName())
						|| "1.3".equals(super.getOperatingSystemVersion())) {
					return true;
				} else {
					return false;
				}
			} else if("5G".equals(getNetworkGeneration())) {
				if("1.3".equals(super.getOperatingSystemVersion())) {
					return true;
				} else {
					return false;
				}
			}
		} else if("Gara".equals(getOperatingSystemName())) {
			if("3G".equals(getNetworkGeneration())){
				if("EXRT.1".equals(super.getOperatingSystemVersion()) 
						|| "EXRT.2".equals(super.getOperatingSystemName())
						|| "EXRU.1".equals(super.getOperatingSystemVersion())) {
					return true;
				} else {
					return false;
				}
			} else if("4G".equals(getNetworkGeneration())) {
				if("EXRT.2".equals(super.getOperatingSystemName())
						|| "EXRU.1".equals(super.getOperatingSystemVersion())) {
					return true;
				} else {
					return false;
				}
			} else if("5G".equals(getNetworkGeneration())) {
				if("EXRU.1".equals(super.getOperatingSystemVersion())) {
					return true;
				} else {
					return false;
				}
			}
	} else {
		return false;
	}
		return false;
}
}
