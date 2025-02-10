package org.example;

import org.hibernate.type.BigDecimalType;
import org.hibernate.type.BigIntegerType;
import org.hibernate.type.BinaryType;
import org.hibernate.type.BlobType;
import org.hibernate.type.BooleanType;
import org.hibernate.type.ByteType;
import org.hibernate.type.CalendarType;
import org.hibernate.type.CalendarDateType;
import org.hibernate.type.CharArrayType;
import org.hibernate.type.CharacterType;
import org.hibernate.type.CharacterArrayType;
import org.hibernate.type.ClassType;
import org.hibernate.type.ClobType;
import org.hibernate.type.CurrencyType;
import org.hibernate.type.DateType;
import org.hibernate.type.DoubleType;
import org.hibernate.type.FloatType;
import org.hibernate.type.ImageType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocaleType;
import org.hibernate.type.LongType;
import org.hibernate.type.MaterializedBlobType;
import org.hibernate.type.MaterializedClobType;
import org.hibernate.type.MaterializedNClobType;
import org.hibernate.type.NClobType;
import org.hibernate.type.StringNVarcharType;
import org.hibernate.type.NTextType;
import org.hibernate.type.NumericBooleanType;
import org.hibernate.type.RowVersionType;
import org.hibernate.type.SerializableType;
import org.hibernate.type.ShortType;
import org.hibernate.type.StringType;
import org.hibernate.type.TextType;
import org.hibernate.type.TimeType;
import org.hibernate.type.TimestampType;
import org.hibernate.type.TimeZoneType;
import org.hibernate.type.TrueFalseType;
import org.hibernate.type.UrlType;
import org.hibernate.type.UUIDBinaryType;
import org.hibernate.type.UUIDCharType;
import org.hibernate.type.WrapperBinaryType;
import org.hibernate.type.YesNoType;

public class HibernateBasicTypes {

    public static void main(String[] args) {
        useTypes();
    }

    public static void useTypes() {
        // Dummy-Aufrufe, um die Instanzen zu verwenden.
        // Voraussetzung: Jede der alten Typ-Klassen stellt ein public static final INSTANCE-Feld zur Verfügung.
        System.out.println(BigDecimalType.INSTANCE);
        System.out.println(BigIntegerType.INSTANCE);
        System.out.println(BinaryType.INSTANCE);
        System.out.println(BlobType.INSTANCE);
        System.out.println(BooleanType.INSTANCE);
        System.out.println(ByteType.INSTANCE);
        System.out.println(CalendarType.INSTANCE);
        System.out.println(CalendarDateType.INSTANCE);
        System.out.println(CharArrayType.INSTANCE);
        System.out.println(CharacterType.INSTANCE);
        System.out.println(CharacterArrayType.INSTANCE);
        System.out.println(ClassType.INSTANCE);
        System.out.println(ClobType.INSTANCE);
        System.out.println(CurrencyType.INSTANCE);
        System.out.println(DateType.INSTANCE);
        System.out.println(DoubleType.INSTANCE);
        System.out.println(FloatType.INSTANCE);
        System.out.println(ImageType.INSTANCE);
        System.out.println(IntegerType.INSTANCE);
        System.out.println(LocaleType.INSTANCE);
        System.out.println(LongType.INSTANCE);
        System.out.println(MaterializedBlobType.INSTANCE);
        System.out.println(MaterializedClobType.INSTANCE);
        System.out.println(MaterializedNClobType.INSTANCE);
        System.out.println(NClobType.INSTANCE);
        System.out.println(StringNVarcharType.INSTANCE);
        System.out.println(NTextType.INSTANCE);
        System.out.println(NumericBooleanType.INSTANCE);
        System.out.println(RowVersionType.INSTANCE);
        System.out.println(SerializableType.INSTANCE);
        System.out.println(ShortType.INSTANCE);
        System.out.println(StringType.INSTANCE);
        System.out.println(TextType.INSTANCE);
        System.out.println(TimeType.INSTANCE);
        System.out.println(TimestampType.INSTANCE);
        System.out.println(TimeZoneType.INSTANCE);
        System.out.println(TrueFalseType.INSTANCE);
        System.out.println(UrlType.INSTANCE);
        System.out.println(UUIDBinaryType.INSTANCE);
        System.out.println(UUIDCharType.INSTANCE);
        System.out.println(WrapperBinaryType.INSTANCE);
        System.out.println(YesNoType.INSTANCE);
    }
}

