package model.helpers;

import io.qameta.allure.Attachment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public final class FileHelper {
    private static final String RESOURCES_PATH = "src/test/resources";

    public FileHelper() {
    }

    @Attachment(value = "{shownFileName}", type = "application/json", fileExtension = "{extension}")
    public static byte[] attachFile(String shownFileName, String resourceName, String extension) throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES_PATH, resourceName));
    }

    @Attachment(value = "{shownFileName}", type = "image/png", fileExtension = "{extension}")
    public static byte[] attachPicture(String shownFileName, String resourceName, String extension) throws IOException {
        return Files.readAllBytes(Paths.get(RESOURCES_PATH, resourceName));
    }

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(RESOURCES_PATH,file)));
    }


}