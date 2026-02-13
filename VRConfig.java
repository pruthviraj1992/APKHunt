// VRConfig.java

public class VRConfig {
    // Device Profiles
    public static final String DEVICE_MODEL = "Poco X6 Pro";
    public static final int SCREEN_RESOLUTION_X = 2400;
    public static final int SCREEN_RESOLUTION_Y = 1080;
    
    // Rendering Settings
    public static final int RENDERING_QUALITY = 2; // 0: Low, 1: Medium, 2: High
    public static final boolean V_SYNC = true;
    public static final int FRAME_RATE_LIMIT = 60;
    
    // Performance Tuning Parameters
    public static final boolean ENABLE_VR_MODE = true;
    public static final int ANTI_ALIASING_LEVEL = 4;
    public static final float FIELD_OF_VIEW = 110.0f; // in degrees
    
    // Method to print configuration
    public static void printConfig() {
        System.out.println("Device Model: " + DEVICE_MODEL);
        System.out.println("Screen Resolution: " + SCREEN_RESOLUTION_X + "x" + SCREEN_RESOLUTION_Y);
        System.out.println("Rendering Quality: " + RENDERING_QUALITY);
        System.out.println("V-Sync Enabled: " + V_SYNC);
        System.out.println("Frame Rate Limit: " + FRAME_RATE_LIMIT);
        System.out.println("VR Mode Enabled: " + ENABLE_VR_MODE);
        System.out.println("Anti-Aliasing Level: " + ANTI_ALIASING_LEVEL);
        System.out.println("Field of View: " + FIELD_OF_VIEW + " degrees");
    }
}