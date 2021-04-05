package generalFunction;

public class GenericSample {

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

        String temp1 = (String)dto1.getObject();
        String temp2 = (String)dto2.getObject();
        String temp3 = (String)dto3.getObject();
    }

    public void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2= new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());

        String temp1 = dto1.getObject();
    }

    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        //sample.checkCastingDTO();
        sample.checkGenericDTO();

    }
}

