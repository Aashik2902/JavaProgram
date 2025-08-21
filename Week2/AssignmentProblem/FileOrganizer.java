class FileOrganizer {
    static String category(String f){
        if(f.endsWith(".txt")) return "Document";
        if(f.endsWith(".jpg")) return "Image";
        if(f.endsWith(".mp3")) return "Audio";
        return "Other";
    }
    public static void main(String[] a){
        String[] files={"note.txt","pic.jpg","song.mp3","data.bin"};
        for(String f:files)
            System.out.println(f+" -> "+category(f));
    }
}
