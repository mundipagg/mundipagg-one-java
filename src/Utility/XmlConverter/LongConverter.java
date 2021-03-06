package Utility.XmlConverter;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * Conversor de dados tipo long
 */
public class LongConverter implements Converter {
        
    @Override
    public boolean canConvert(Class type) {
        return (type.equals(Long.class));
    }

    @Override
    public void marshal(Object value, HierarchicalStreamWriter writer,
            MarshallingContext context) 
    {
        if(value != null && value.toString().trim().length() > 0)
        {
            writer.setValue(value.toString());
        }
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader,
            UnmarshallingContext context) {
        try
        {
            String value = reader.getValue();
            if(value == null || value.trim().length() == 0)
            {
                return null;
            }
            else   
            {
                return Long.valueOf(value);
            }
        }
        catch(Exception e)
        {
            return null;
        }      
    }
}
