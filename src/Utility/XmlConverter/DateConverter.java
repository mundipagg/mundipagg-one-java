package Utility.XmlConverter;

import DataContracts.ServiceConstants;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Conversor de data
 */
public class DateConverter implements Converter {
    
    private final SimpleDateFormat formatter = new SimpleDateFormat(ServiceConstants.DATE_TIME_FORMAT);

    @Override
    public boolean canConvert(Class clazz) {
        return Date.class.isAssignableFrom(clazz);
    }

    @Override
    public void marshal(Object value, HierarchicalStreamWriter writer,
            MarshallingContext context) {
        Date date = (Date) value;
        writer.setValue(formatter.format(date));
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader,
            UnmarshallingContext context) {
        GregorianCalendar calendar = new GregorianCalendar();
        try {
            calendar.setTime(formatter.parse(reader.getValue()));
        } catch (ParseException e) {
            return null;
        }
        return calendar.getTime();
    }
}
