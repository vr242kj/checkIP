package zd;

public class ValidatorIP implements Validator {


    /**
     * Функція для провірки коректного вводу ip адреси  {@link ValidatorIP#validIP}
     * @param ip - ip яке ввів користувач
     * @return true - якщо ip адреса введена правильно
     *         false - якщо ip адреса введена не правильно
     */
    public static boolean validIP (String ip) {
        try {
            if ( ip == null || ip.isEmpty() ) {
                return false;
            }

            String[] parts = ip.split( "\\." );
            if ( parts.length != 4 ) {
                return false;
            }

            for ( String s : parts ) {
                int i = Integer.parseInt( s );
                if ( (i < 0) || (i > 255) ) {
                    return false;
                }
            }
            if ( ip.endsWith(".") ) {
                return false;
            }

            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
