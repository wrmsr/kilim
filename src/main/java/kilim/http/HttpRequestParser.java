// line 1 "HttpRequestParser.rl"
/* Copyright (c) 2006, Sriram Srinivasan
 *
 * You may distribute this software under the terms of the license
 * specified in the file "License"
 */
package kilim.http;

/**
 * --- DO NOT EDIT -----
 * HttpRequestParser.java generated from RAGEL (http://www.complang.org/ragel/) from the
 * specification file HttpRequestParser.rl. All changes must be made in the .rl file.
 **/

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class HttpRequestParser
{
    public static final Charset UTF8 = Charset.forName("UTF-8");

// line 135 "HttpRequestParser.rl"
    static final int http_parser_start = 1;
    static final int http_parser_first_final = 56;
    static final int http_parser_error = 0;
    static final int http_parser_en_main = 1;
    static final int http_keywords_start = 307;
    static final int http_keywords_first_final = 307;
    static final int http_keywords_error = 0;
    static final int http_keywords_en_main = 307;
    static final int http_date_start = 1;
    static final int http_date_first_final = 98;
    static final int http_date_error = 0;
    static final int http_date_en_main = 1;
    private static final byte _http_parser_actions[] = init__http_parser_actions_0();
    private static final short _http_parser_key_offsets[] = init__http_parser_key_offsets_0();
    private static final char _http_parser_trans_keys[] = init__http_parser_trans_keys_0();
    private static final byte _http_parser_single_lengths[] = init__http_parser_single_lengths_0();
    private static final byte _http_parser_range_lengths[] = init__http_parser_range_lengths_0();
    private static final short _http_parser_index_offsets[] = init__http_parser_index_offsets_0();
    private static final byte _http_parser_indicies[] = init__http_parser_indicies_0();
    private static final byte _http_parser_trans_targs[] = init__http_parser_trans_targs_0();
    private static final byte _http_parser_trans_actions[] = init__http_parser_trans_actions_0();
    private static final byte _http_keywords_actions[] = init__http_keywords_actions_0();

// line 138 "HttpRequestParser.rl"
    private static final short _http_keywords_key_offsets[] = init__http_keywords_key_offsets_0();
    private static final char _http_keywords_trans_keys[] = init__http_keywords_trans_keys_0();
    private static final byte _http_keywords_single_lengths[] = init__http_keywords_single_lengths_0();
    private static final byte _http_keywords_range_lengths[] = init__http_keywords_range_lengths_0();
    private static final short _http_keywords_index_offsets[] = init__http_keywords_index_offsets_0();
    private static final short _http_keywords_trans_targs[] = init__http_keywords_trans_targs_0();
    private static final byte _http_keywords_trans_actions[] = init__http_keywords_trans_actions_0();
    private static final byte _http_keywords_to_state_actions[] = init__http_keywords_to_state_actions_0();
    private static final byte _http_keywords_from_state_actions[] = init__http_keywords_from_state_actions_0();
    private static final short _http_keywords_eof_trans[] = init__http_keywords_eof_trans_0();
    private static final byte _http_date_actions[] = init__http_date_actions_0();
    private static final short _http_date_key_offsets[] = init__http_date_key_offsets_0();
    private static final char _http_date_trans_keys[] = init__http_date_trans_keys_0();
    private static final byte _http_date_single_lengths[] = init__http_date_single_lengths_0();
    private static final byte _http_date_range_lengths[] = init__http_date_range_lengths_0();
    private static final short _http_date_index_offsets[] = init__http_date_index_offsets_0();
    private static final byte _http_date_trans_targs[] = init__http_date_trans_targs_0();
    private static final byte _http_date_trans_actions[] = init__http_date_trans_actions_0();
    public static TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static String crlf = "\r\n";

    // line 34 "HttpRequestParser.java"
    private static byte[] init__http_parser_actions_0()
    {
        return new byte[] {
                0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1,
                5, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10, 1,
                11, 1, 12, 1, 13, 2, 0, 3, 2, 0, 6, 2,
                1, 5
        };
    }

    private static short[] init__http_parser_key_offsets_0()
    {
        return new short[] {
                0, 0, 10, 12, 14, 16, 18, 20, 21, 31, 41, 50,
                52, 53, 54, 55, 56, 58, 61, 63, 66, 67, 69, 70,
                72, 73, 75, 84, 93, 99, 105, 111, 117, 121, 125, 135,
                141, 147, 156, 165, 171, 177, 179, 181, 183, 185, 187, 189,
                191, 193, 195, 197, 199, 203, 205, 207, 209
        };
    }

    private static char[] init__http_parser_trans_keys_0()
    {
        return new char[] {
                68, 71, 72, 79, 80, 100, 103, 104, 111, 112, 69, 101,
                76, 108, 69, 101, 84, 116, 69, 101, 32, 32, 43, 47,
                58, 45, 57, 65, 90, 97, 122, 43, 58, 45, 46, 48,
                57, 65, 90, 97, 122, 32, 34, 35, 37, 60, 62, 127,
                0, 31, 32, 72, 84, 84, 80, 47, 48, 57, 46, 48,
                57, 48, 57, 13, 48, 57, 10, 13, 58, 58, 13, 32,
                13, 10, 58, 32, 37, 60, 62, 127, 0, 31, 34, 35,
                32, 37, 60, 62, 127, 0, 31, 34, 35, 48, 57, 65,
                70, 97, 102, 48, 57, 65, 70, 97, 102, 48, 57, 65,
                70, 97, 102, 48, 57, 65, 70, 97, 102, 32, 35, 59,
                63, 32, 35, 59, 63, 32, 34, 35, 37, 60, 62, 63,
                127, 0, 31, 48, 57, 65, 70, 97, 102, 48, 57, 65,
                70, 97, 102, 32, 34, 35, 37, 60, 62, 127, 0, 31,
                32, 34, 35, 37, 60, 62, 127, 0, 31, 48, 57, 65,
                70, 97, 102, 48, 57, 65, 70, 97, 102, 69, 101, 84,
                116, 69, 101, 65, 97, 68, 100, 80, 112, 84, 116, 73,
                105, 79, 111, 78, 110, 83, 115, 79, 85, 111, 117, 83,
                115, 84, 116, 84, 116, 58, 0
        };
    }

    private static byte[] init__http_parser_single_lengths_0()
    {
        return new byte[] {
                0, 10, 2, 2, 2, 2, 2, 1, 4, 2, 7, 2,
                1, 1, 1, 1, 0, 1, 0, 1, 1, 2, 1, 2,
                1, 2, 5, 5, 0, 0, 0, 0, 4, 4, 8, 0,
                0, 7, 7, 0, 0, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 4, 2, 2, 2, 1
        };
    }

    private static byte[] init__http_parser_range_lengths_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 1, 0,
                0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0,
                0, 0, 2, 2, 3, 3, 3, 3, 0, 0, 1, 3,
                3, 1, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0
        };
    }

    private static short[] init__http_parser_index_offsets_0()
    {
        return new short[] {
                0, 0, 11, 14, 17, 20, 23, 26, 28, 36, 43, 52,
                55, 57, 59, 61, 63, 65, 68, 70, 73, 75, 78, 80,
                83, 85, 88, 96, 104, 108, 112, 116, 120, 125, 130, 140,
                144, 148, 157, 166, 170, 174, 177, 180, 183, 186, 189, 192,
                195, 198, 201, 204, 207, 212, 215, 218, 221
        };
    }

    private static byte[] init__http_parser_indicies_0()
    {
        return new byte[] {
                0, 2, 3, 4, 5, 0, 2, 3, 4, 5, 1, 6,
                6, 1, 7, 7, 1, 8, 8, 1, 9, 9, 1, 10,
                10, 1, 11, 1, 11, 12, 13, 14, 12, 12, 12, 1,
                15, 16, 15, 15, 15, 15, 1, 17, 1, 18, 19, 1,
                1, 1, 1, 16, 17, 20, 1, 21, 1, 22, 1, 23,
                1, 24, 1, 25, 1, 26, 27, 1, 28, 1, 29, 28,
                1, 30, 1, 32, 1, 31, 34, 33, 36, 37, 35, 39,
                38, 40, 34, 33, 41, 43, 1, 1, 1, 1, 1, 42,
                44, 46, 1, 1, 1, 1, 1, 45, 47, 47, 47, 1,
                45, 45, 45, 1, 48, 48, 48, 1, 16, 16, 16, 1,
                17, 18, 50, 51, 49, 52, 53, 54, 55, 49, 17, 1,
                18, 56, 1, 1, 51, 1, 1, 50, 57, 57, 57, 1,
                50, 50, 50, 1, 58, 1, 60, 61, 1, 1, 1, 1,
                59, 62, 1, 64, 65, 1, 1, 1, 1, 63, 66, 66,
                66, 1, 63, 63, 63, 1, 67, 67, 1, 68, 68, 1,
                69, 69, 1, 70, 70, 1, 71, 71, 1, 72, 72, 1,
                73, 73, 1, 74, 74, 1, 75, 75, 1, 76, 76, 1,
                77, 77, 1, 78, 79, 78, 79, 1, 80, 80, 1, 81,
                81, 1, 82, 82, 1, 34, 33, 0
        };
    }

    private static byte[] init__http_parser_trans_targs_0()
    {
        return new byte[] {
                2, 0, 41, 43, 46, 52, 3, 4, 5, 6, 7, 8,
                9, 32, 10, 9, 10, 11, 26, 30, 12, 13, 14, 15,
                16, 17, 18, 17, 19, 20, 21, 22, 25, 22, 23, 24,
                20, 23, 24, 20, 56, 11, 27, 28, 11, 27, 28, 29,
                31, 33, 34, 37, 11, 26, 34, 37, 35, 36, 11, 38,
                26, 39, 11, 38, 26, 39, 40, 42, 7, 44, 45, 7,
                47, 48, 49, 50, 51, 7, 53, 55, 54, 7, 7
        };
    }

    private static byte[] init__http_parser_trans_actions_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 0,
                1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 1, 0, 0, 0, 15, 0, 1, 1, 0, 5, 1,
                29, 1, 0, 7, 0, 32, 1, 1, 13, 0, 0, 0,
                0, 0, 0, 0, 9, 9, 9, 9, 0, 0, 35, 3,
                35, 3, 11, 0, 11, 0, 0, 0, 17, 0, 0, 23,
                0, 0, 0, 0, 0, 27, 0, 0, 0, 19, 25
        };
    }

// line 226 "HttpRequestParser.rl"

    public static void err(String msg)
            throws IOException
    {
        throw new IOException(msg);
    }

    public static void initHeader(HttpRequest req, int headerLength)
            throws IOException
    {
        ByteBuffer bb = req.buffer;
    /* required variables */
        byte[] data = bb.array();
        int p = 0;
        int pe = headerLength;
//  int eof = pe;
        int cs = 0;

        // variables used by actions in http_req_parser machine above.
        int query_start = 0;
        int mark = 0;
        String field_name = "";

// line 219 "HttpRequestParser.java"
        {
            cs = http_parser_start;
        }

// line 158 "HttpRequestParser.rl"

// line 226 "HttpRequestParser.java"
        {
            int _klen;
            int _trans = 0;
            int _acts;
            int _nacts;
            int _keys;
            int _goto_targ = 0;

            _goto:
            while (true) {
                switch (_goto_targ) {
                    case 0:
                        if (p == pe) {
                            _goto_targ = 4;
                            continue _goto;
                        }
                        if (cs == 0) {
                            _goto_targ = 5;
                            continue _goto;
                        }
                    case 1:
                        _match:
                        do {
                            _keys = _http_parser_key_offsets[cs];
                            _trans = _http_parser_index_offsets[cs];
                            _klen = _http_parser_single_lengths[cs];
                            if (_klen > 0) {
                                int _lower = _keys;
                                int _mid;
                                int _upper = _keys + _klen - 1;
                                while (true) {
                                    if (_upper < _lower) {
                                        break;
                                    }

                                    _mid = _lower + ((_upper - _lower) >> 1);
                                    if (data[p] < _http_parser_trans_keys[_mid]) {
                                        _upper = _mid - 1;
                                    }
                                    else if (data[p] > _http_parser_trans_keys[_mid]) {
                                        _lower = _mid + 1;
                                    }
                                    else {
                                        _trans += (_mid - _keys);
                                        break _match;
                                    }
                                }
                                _keys += _klen;
                                _trans += _klen;
                            }

                            _klen = _http_parser_range_lengths[cs];
                            if (_klen > 0) {
                                int _lower = _keys;
                                int _mid;
                                int _upper = _keys + (_klen << 1) - 2;
                                while (true) {
                                    if (_upper < _lower) {
                                        break;
                                    }

                                    _mid = _lower + (((_upper - _lower) >> 1) & ~1);
                                    if (data[p] < _http_parser_trans_keys[_mid]) {
                                        _upper = _mid - 2;
                                    }
                                    else if (data[p] > _http_parser_trans_keys[_mid + 1]) {
                                        _lower = _mid + 2;
                                    }
                                    else {
                                        _trans += ((_mid - _keys) >> 1);
                                        break _match;
                                    }
                                }
                                _trans += _klen;
                            }
                        }
                        while (false);

                        _trans = _http_parser_indicies[_trans];
                        cs = _http_parser_trans_targs[_trans];

                        if (_http_parser_trans_actions[_trans] != 0) {
                            _acts = _http_parser_trans_actions[_trans];
                            _nacts = (int) _http_parser_actions[_acts++];
                            while (_nacts-- > 0) {
                                switch (_http_parser_actions[_acts++]) {
                                    case 0:
// line 31 "HttpRequestParser.rl"
                                    {
                                        mark = p;
                                    }
                                    break;
                                    case 1:
// line 33 "HttpRequestParser.rl"
                                    {
                                        query_start = p;
                                    }
                                    break;
                                    case 2:
// line 35 "HttpRequestParser.rl"
                                    {
                                        field_name = kw_lookup(data, mark, p);
                                        if (field_name == null) {// not a known keyword
                                            field_name = req.extractRange(mark, p);
                                        }
                                    }
                                    break;
                                    case 3:
// line 42 "HttpRequestParser.rl"
                                    {
                                        int value = encodeRange(mark, p);
                                        req.addField(field_name, value);
                                    }
                                    break;
                                    case 4:
// line 47 "HttpRequestParser.rl"
                                    {
                                        req.uriPath = req.extractRange(mark, p);
                                        String s = req.uriPath;
                                        int len = s.length();
                                        boolean need_decode;
                                        // Scan the string to see if the string requires any conversion.
                                        for (int i = 0; i < len; i++) {
                                            char c = s.charAt(i);
                                            if (c == '%' || c > 0x7F) {
                                                try {
                                                    // TODO: Correct this. URLDecoder is broken for path (upto
                                                    // JDK1.6): it converts'+' to ' ', which should
                                                    // be done only for the query part of the url.
                                                    req.uriPath = URLDecoder.decode(req.uriPath, "UTF-8");
                                                    break;
                                                }
                                                catch (UnsupportedEncodingException ignore) {
                                                }
                                            }
                                        }
                                    }
                                    break;
                                    case 5:
// line 72 "HttpRequestParser.rl"
                                    {
                                        req.queryStringRange = encodeRange(query_start, p);
                                    }
                                    break;
                                    case 6:
// line 76 "HttpRequestParser.rl"
                                    {
                                        req.uriFragmentRange = encodeRange(mark, p);
                                    }
                                    break;
                                    case 7:
// line 80 "HttpRequestParser.rl"
                                    {
                                        req.versionRange = encodeRange(mark, p);
                                    }
                                    break;
                                    case 8:
// line 119 "HttpRequestParser.rl"
                                    {
                                        req.method = "GET";
                                    }
                                    break;
                                    case 9:
// line 120 "HttpRequestParser.rl"
                                    {
                                        req.method = "POST";
                                    }
                                    break;
                                    case 10:
// line 121 "HttpRequestParser.rl"
                                    {
                                        req.method = "DELETE";
                                    }
                                    break;
                                    case 11:
// line 122 "HttpRequestParser.rl"
                                    {
                                        req.method = "HEAD";
                                    }
                                    break;
                                    case 12:
// line 123 "HttpRequestParser.rl"
                                    {
                                        req.method = "PUT";
                                    }
                                    break;
                                    case 13:
// line 124 "HttpRequestParser.rl"
                                    {
                                        req.method = "OPTIONS";
                                    }
                                    break;
// line 394 "HttpRequestParser.java"
                                }
                            }
                        }

                    case 2:
                        if (cs == 0) {
                            _goto_targ = 5;
                            continue _goto;
                        }
                        if (++p != pe) {
                            _goto_targ = 1;
                            continue _goto;
                        }
                    case 4:
                    case 5:
                }
                break;
            }
        }

// line 159 "HttpRequestParser.rl"

        if (cs == http_parser_error) {
            throw new IOException("Malformed HTTP Header. p = " + p + ", cs = " + cs);
        }
    }

    /**
     * encode the start pos and length as ints;
     */
    public static int encodeRange(int start, int end)
    {
        return (start << 16) + end;
    }

    // line 429 "HttpRequestParser.java"
    private static byte[] init__http_keywords_actions_0()
    {
        return new byte[] {
                0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1,
                5, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10, 1,
                11, 1, 12, 1, 13, 1, 14, 1, 15, 1, 16, 1,
                17, 1, 18, 1, 19, 1, 20, 1, 21, 1, 22, 1,
                23, 1, 24, 1, 25, 1, 26, 1, 27, 1, 28, 1,
                29, 1, 30, 1, 31, 1, 32, 1, 33, 1, 34, 1,
                35, 1, 36, 1, 37, 1, 38, 1, 39, 1, 40, 1,
                41, 1, 42, 1, 43, 1, 44, 1, 45, 1, 46, 1,
                47, 1, 48, 1, 49, 1, 50
        };
    }

    private static short[] init__http_keywords_key_offsets_0()
    {
        return new short[] {
                0, 0, 8, 10, 12, 14, 16, 24, 26, 28, 30, 32,
                34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56,
                58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80,
                82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104,
                108, 110, 112, 114, 115, 117, 119, 121, 123, 125, 127, 129,
                131, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153, 154,
                164, 166, 168, 170, 172, 174, 176, 178, 184, 186, 188, 190,
                192, 194, 196, 198, 200, 202, 204, 206, 208, 210, 212, 214,
                216, 218, 219, 221, 223, 225, 227, 229, 231, 233, 235, 237,
                239, 243, 245, 247, 249, 253, 255, 257, 259, 261, 263, 265,
                267, 269, 271, 273, 275, 277, 278, 286, 290, 292, 294, 296,
                298, 300, 302, 304, 306, 308, 309, 311, 313, 315, 317, 319,
                321, 323, 325, 326, 328, 330, 332, 334, 336, 338, 340, 342,
                344, 346, 348, 350, 352, 354, 356, 358, 360, 362, 363, 365,
                367, 369, 371, 373, 377, 379, 381, 382, 384, 386, 388, 390,
                392, 394, 396, 398, 400, 402, 404, 406, 408, 410, 412, 414,
                415, 417, 419, 421, 423, 425, 427, 429, 431, 433, 437, 439,
                441, 443, 445, 447, 448, 450, 452, 454, 456, 460, 462, 464,
                466, 468, 470, 472, 474, 476, 478, 480, 482, 484, 486, 488,
                490, 494, 496, 498, 500, 504, 506, 508, 510, 512, 514, 516,
                517, 519, 521, 523, 525, 527, 529, 531, 533, 535, 537, 541,
                543, 547, 549, 551, 553, 555, 557, 559, 561, 562, 564, 566,
                568, 570, 572, 574, 576, 578, 582, 584, 586, 588, 590, 592,
                594, 596, 597, 599, 601, 603, 605, 607, 611, 613, 615, 617,
                621, 623, 625, 627, 629, 631, 633, 634, 636, 638, 640, 642,
                644, 646, 648, 650, 652, 654, 656, 658, 690
        };
    }

    private static char[] init__http_keywords_trans_keys_0()
    {
        return new char[] {
                67, 71, 76, 85, 99, 103, 108, 117, 67, 99, 69, 101,
                80, 112, 84, 116, 67, 69, 76, 82, 99, 101, 108, 114,
                72, 104, 65, 97, 82, 114, 83, 115, 69, 101, 84, 116,
                78, 110, 67, 99, 79, 111, 68, 100, 73, 105, 78, 110,
                71, 103, 65, 97, 78, 110, 71, 103, 85, 117, 65, 97,
                71, 103, 69, 101, 65, 97, 78, 110, 71, 103, 69, 101,
                83, 115, 69, 101, 76, 108, 79, 111, 87, 119, 84, 116,
                72, 104, 79, 111, 82, 114, 73, 105, 90, 122, 65, 97,
                84, 116, 73, 105, 79, 111, 78, 110, 65, 79, 97, 111,
                67, 99, 72, 104, 69, 101, 45, 67, 99, 79, 111, 78,
                110, 84, 116, 82, 114, 79, 111, 76, 108, 78, 110, 78,
                84, 110, 116, 69, 101, 67, 99, 84, 116, 73, 105, 79,
                111, 78, 110, 69, 101, 78, 110, 84, 116, 45, 69, 76,
                77, 82, 84, 101, 108, 109, 114, 116, 78, 110, 67, 99,
                79, 111, 68, 100, 73, 105, 78, 110, 71, 103, 65, 69,
                79, 97, 101, 111, 78, 110, 71, 103, 85, 117, 65, 97,
                71, 103, 69, 101, 78, 110, 71, 103, 84, 116, 72, 104,
                67, 99, 65, 97, 84, 116, 73, 105, 79, 111, 78, 110,
                68, 100, 53, 65, 97, 78, 110, 71, 103, 69, 101, 89,
                121, 80, 112, 69, 101, 65, 97, 84, 116, 69, 101, 84,
                88, 116, 120, 65, 97, 71, 103, 80, 112, 69, 73, 101,
                105, 67, 99, 84, 116, 82, 114, 69, 101, 83, 115, 82,
                114, 79, 111, 77, 109, 79, 111, 83, 115, 84, 116, 70,
                102, 45, 77, 78, 82, 85, 109, 110, 114, 117, 65, 79,
                97, 111, 84, 116, 67, 99, 72, 104, 68, 100, 73, 105,
                70, 102, 73, 105, 69, 101, 68, 100, 45, 83, 115, 73,
                105, 78, 110, 67, 99, 69, 101, 79, 111, 78, 110, 69,
                101, 45, 77, 109, 65, 97, 84, 116, 67, 99, 72, 104,
                65, 97, 78, 110, 71, 103, 69, 101, 78, 110, 77, 109,
                79, 111, 68, 100, 73, 105, 70, 102, 73, 105, 69, 101,
                68, 100, 45, 83, 115, 73, 105, 78, 110, 67, 99, 69,
                101, 65, 79, 97, 111, 83, 115, 84, 116, 45, 77, 109,
                79, 111, 68, 100, 73, 105, 70, 102, 73, 105, 69, 101,
                68, 100, 67, 99, 65, 97, 84, 116, 73, 105, 79, 111,
                78, 110, 65, 97, 88, 120, 45, 70, 102, 79, 111, 82,
                114, 87, 119, 65, 97, 82, 114, 68, 100, 83, 115, 82,
                114, 65, 79, 97, 111, 71, 103, 77, 109, 65, 97, 88,
                120, 89, 121, 45, 65, 97, 85, 117, 84, 116, 72, 104,
                69, 79, 101, 111, 78, 110, 84, 116, 73, 105, 67, 99,
                65, 97, 84, 116, 69, 101, 82, 114, 73, 105, 90, 122,
                65, 97, 84, 116, 73, 105, 79, 111, 78, 110, 65, 69,
                97, 101, 78, 110, 71, 103, 69, 101, 70, 84, 102, 116,
                69, 101, 82, 114, 69, 101, 82, 114, 82, 114, 89, 121,
                45, 65, 97, 70, 102, 84, 116, 69, 101, 82, 114, 69,
                101, 82, 114, 86, 118, 69, 101, 82, 114, 69, 82, 101,
                114, 65, 97, 73, 78, 105, 110, 76, 108, 69, 101, 82,
                114, 83, 115, 70, 102, 69, 101, 82, 114, 45, 69, 101,
                78, 110, 67, 99, 79, 111, 68, 100, 73, 105, 78, 110,
                71, 103, 80, 83, 112, 115, 71, 103, 82, 114, 65, 97,
                68, 100, 69, 101, 69, 101, 82, 114, 45, 65, 97, 71,
                103, 69, 101, 78, 110, 84, 116, 65, 73, 97, 105, 82,
                114, 89, 121, 65, 97, 65, 87, 97, 119, 82, 114, 78,
                110, 73, 105, 78, 110, 71, 103, 87, 119, 45, 65, 97,
                85, 117, 84, 116, 72, 104, 69, 101, 78, 110, 84, 116,
                73, 105, 67, 99, 65, 97, 84, 116, 69, 101, 65, 67,
                68, 69, 70, 72, 73, 76, 77, 80, 82, 83, 84, 85,
                86, 87, 97, 99, 100, 101, 102, 104, 105, 108, 109, 112,
                114, 115, 116, 117, 118, 119, 45, 0
        };
    }

    private static byte[] init__http_keywords_single_lengths_0()
    {
        return new byte[] {
                0, 8, 2, 2, 2, 2, 8, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4,
                2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2,
                4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 10,
                2, 2, 2, 2, 2, 2, 2, 6, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                4, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 1, 8, 4, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2,
                2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2,
                2, 2, 2, 4, 2, 2, 1, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 2, 2,
                2, 2, 2, 1, 2, 2, 2, 2, 4, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                4, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 1,
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 2,
                4, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2,
                2, 2, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2,
                2, 1, 2, 2, 2, 2, 2, 4, 2, 2, 2, 4,
                2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 2, 32, 1
        };
    }

    private static byte[] init__http_keywords_range_lengths_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0
        };
    }

    private static short[] init__http_keywords_index_offsets_0()
    {
        return new short[] {
                0, 0, 9, 12, 15, 18, 21, 30, 33, 36, 39, 42,
                45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78,
                81, 84, 87, 90, 93, 96, 99, 102, 105, 108, 111, 114,
                117, 120, 123, 126, 129, 132, 135, 138, 141, 144, 147, 150,
                155, 158, 161, 164, 166, 169, 172, 175, 178, 181, 184, 187,
                190, 195, 198, 201, 204, 207, 210, 213, 216, 219, 222, 224,
                235, 238, 241, 244, 247, 250, 253, 256, 263, 266, 269, 272,
                275, 278, 281, 284, 287, 290, 293, 296, 299, 302, 305, 308,
                311, 314, 316, 319, 322, 325, 328, 331, 334, 337, 340, 343,
                346, 351, 354, 357, 360, 365, 368, 371, 374, 377, 380, 383,
                386, 389, 392, 395, 398, 401, 403, 412, 417, 420, 423, 426,
                429, 432, 435, 438, 441, 444, 446, 449, 452, 455, 458, 461,
                464, 467, 470, 472, 475, 478, 481, 484, 487, 490, 493, 496,
                499, 502, 505, 508, 511, 514, 517, 520, 523, 526, 528, 531,
                534, 537, 540, 543, 548, 551, 554, 556, 559, 562, 565, 568,
                571, 574, 577, 580, 583, 586, 589, 592, 595, 598, 601, 604,
                606, 609, 612, 615, 618, 621, 624, 627, 630, 633, 638, 641,
                644, 647, 650, 653, 655, 658, 661, 664, 667, 672, 675, 678,
                681, 684, 687, 690, 693, 696, 699, 702, 705, 708, 711, 714,
                717, 722, 725, 728, 731, 736, 739, 742, 745, 748, 751, 754,
                756, 759, 762, 765, 768, 771, 774, 777, 780, 783, 786, 791,
                794, 799, 802, 805, 808, 811, 814, 817, 820, 822, 825, 828,
                831, 834, 837, 840, 843, 846, 851, 854, 857, 860, 863, 866,
                869, 872, 874, 877, 880, 883, 886, 889, 894, 897, 900, 903,
                908, 911, 914, 917, 920, 923, 926, 928, 931, 934, 937, 940,
                943, 946, 949, 952, 955, 958, 961, 964, 997
        };
    }

    private static short[] init__http_keywords_trans_targs_0()
    {
        return new short[] {
                2, 32, 33, 36, 2, 32, 33, 36, 0, 3, 3, 0,
                4, 4, 0, 5, 5, 0, 308, 308, 0, 7, 13, 20,
                27, 7, 13, 20, 27, 307, 8, 8, 307, 9, 9, 307,
                10, 10, 307, 11, 11, 307, 12, 12, 307, 307, 307, 307,
                14, 14, 307, 15, 15, 307, 16, 16, 307, 17, 17, 307,
                18, 18, 307, 19, 19, 307, 307, 307, 307, 21, 21, 307,
                22, 22, 307, 23, 23, 307, 24, 24, 307, 25, 25, 307,
                26, 26, 307, 307, 307, 307, 28, 28, 307, 29, 29, 307,
                30, 30, 307, 31, 31, 307, 307, 307, 307, 307, 307, 0,
                34, 34, 0, 35, 35, 0, 307, 307, 0, 37, 37, 0,
                38, 38, 0, 39, 39, 0, 40, 40, 0, 41, 41, 0,
                42, 42, 0, 43, 43, 0, 44, 44, 0, 45, 45, 0,
                46, 46, 0, 307, 307, 0, 48, 59, 48, 59, 0, 49,
                49, 0, 50, 50, 0, 51, 51, 0, 52, 0, 53, 53,
                0, 54, 54, 0, 55, 55, 0, 56, 56, 0, 57, 57,
                0, 58, 58, 0, 307, 307, 0, 60, 60, 0, 61, 67,
                61, 67, 0, 62, 62, 0, 63, 63, 0, 64, 64, 0,
                65, 65, 0, 66, 66, 0, 307, 307, 0, 68, 68, 0,
                69, 69, 0, 70, 70, 0, 71, 0, 72, 79, 96, 98,
                102, 72, 79, 96, 98, 102, 0, 73, 73, 0, 74, 74,
                0, 75, 75, 0, 76, 76, 0, 77, 77, 0, 78, 78,
                0, 307, 307, 0, 80, 86, 90, 80, 86, 90, 0, 81,
                81, 0, 82, 82, 0, 83, 83, 0, 84, 84, 0, 85,
                85, 0, 307, 307, 0, 87, 87, 0, 88, 88, 0, 89,
                89, 0, 307, 307, 0, 91, 91, 0, 92, 92, 0, 93,
                93, 0, 94, 94, 0, 95, 95, 0, 307, 307, 0, 97,
                97, 0, 307, 0, 99, 99, 0, 100, 100, 0, 101, 101,
                0, 307, 307, 0, 103, 103, 0, 104, 104, 0, 307, 307,
                0, 106, 106, 0, 107, 107, 0, 307, 307, 0, 109, 111,
                109, 111, 0, 110, 110, 0, 307, 307, 0, 112, 112, 0,
                113, 115, 113, 115, 0, 114, 114, 0, 307, 307, 0, 116,
                116, 0, 117, 117, 0, 307, 307, 0, 119, 119, 0, 120,
                120, 0, 307, 307, 0, 122, 122, 0, 123, 123, 0, 307,
                307, 0, 125, 125, 0, 126, 0, 127, 143, 152, 156, 127,
                143, 152, 156, 0, 128, 131, 128, 131, 0, 129, 129, 0,
                130, 130, 0, 307, 307, 0, 132, 132, 0, 133, 133, 0,
                134, 134, 0, 135, 135, 0, 136, 136, 0, 137, 137, 0,
                138, 0, 139, 139, 0, 140, 140, 0, 141, 141, 0, 142,
                142, 0, 307, 307, 0, 144, 144, 0, 145, 145, 0, 146,
                146, 0, 147, 0, 148, 148, 0, 149, 149, 0, 150, 150,
                0, 151, 151, 0, 307, 307, 0, 153, 153, 0, 154, 154,
                0, 155, 155, 0, 307, 307, 0, 157, 157, 0, 158, 158,
                0, 159, 159, 0, 160, 160, 0, 161, 161, 0, 162, 162,
                0, 163, 163, 0, 164, 164, 0, 165, 165, 0, 166, 0,
                167, 167, 0, 168, 168, 0, 169, 169, 0, 170, 170, 0,
                307, 307, 0, 172, 183, 172, 183, 0, 173, 173, 0, 174,
                174, 0, 175, 0, 176, 176, 0, 177, 177, 0, 178, 178,
                0, 179, 179, 0, 180, 180, 0, 181, 181, 0, 182, 182,
                0, 307, 307, 0, 184, 184, 0, 185, 185, 0, 186, 186,
                0, 187, 187, 0, 188, 188, 0, 307, 307, 0, 190, 190,
                0, 191, 191, 0, 192, 0, 193, 193, 0, 194, 194, 0,
                195, 195, 0, 196, 196, 0, 197, 197, 0, 198, 198, 0,
                199, 199, 0, 307, 307, 0, 201, 201, 0, 202, 205, 202,
                205, 0, 203, 203, 0, 204, 204, 0, 307, 307, 0, 206,
                206, 0, 207, 207, 0, 208, 0, 209, 209, 0, 210, 210,
                0, 211, 211, 0, 212, 212, 0, 213, 220, 213, 220, 0,
                214, 214, 0, 215, 215, 0, 216, 216, 0, 217, 217, 0,
                218, 218, 0, 219, 219, 0, 307, 307, 0, 221, 221, 0,
                222, 222, 0, 223, 223, 0, 224, 224, 0, 225, 225, 0,
                226, 226, 0, 227, 227, 0, 307, 307, 0, 229, 232, 229,
                232, 0, 230, 230, 0, 231, 231, 0, 307, 307, 0, 233,
                237, 233, 237, 0, 234, 234, 0, 235, 235, 0, 236, 236,
                0, 307, 307, 0, 238, 238, 0, 239, 239, 0, 240, 0,
                241, 241, 0, 242, 242, 0, 243, 243, 0, 244, 244, 0,
                307, 307, 0, 246, 246, 0, 247, 247, 0, 248, 248, 0,
                249, 249, 0, 307, 307, 0, 307, 251, 307, 251, 0, 252,
                252, 0, 253, 256, 253, 256, 0, 254, 254, 0, 255, 255,
                0, 307, 307, 0, 257, 257, 0, 258, 258, 0, 259, 259,
                0, 260, 260, 0, 261, 0, 262, 262, 0, 263, 263, 0,
                264, 264, 0, 265, 265, 0, 266, 266, 0, 267, 267, 0,
                268, 268, 0, 307, 307, 0, 270, 275, 270, 275, 0, 271,
                271, 0, 272, 272, 0, 273, 273, 0, 274, 274, 0, 307,
                307, 0, 276, 276, 0, 277, 277, 0, 278, 0, 279, 279,
                0, 280, 280, 0, 281, 281, 0, 282, 282, 0, 307, 307,
                0, 284, 286, 284, 286, 0, 285, 285, 0, 307, 307, 0,
                307, 307, 0, 288, 293, 288, 293, 0, 289, 289, 0, 290,
                290, 0, 291, 291, 0, 292, 292, 0, 307, 307, 0, 294,
                294, 0, 295, 0, 296, 296, 0, 297, 297, 0, 298, 298,
                0, 299, 299, 0, 300, 300, 0, 301, 301, 0, 302, 302,
                0, 303, 303, 0, 304, 304, 0, 305, 305, 0, 306, 306,
                0, 307, 307, 0, 1, 47, 105, 108, 118, 121, 124, 171,
                189, 200, 228, 245, 250, 269, 283, 287, 1, 47, 105, 108,
                118, 121, 124, 171, 189, 200, 228, 245, 250, 269, 283, 287,
                0, 6, 307, 307, 307, 307, 307, 307, 307, 307, 307, 307,
                307, 307, 307, 307, 307, 307, 307, 307, 307, 307, 307, 307,
                307, 307, 307, 307, 307, 307, 0
        };
    }

    private static byte[] init__http_keywords_trans_actions_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 101, 0, 0, 101, 0, 0, 101,
                0, 0, 101, 0, 0, 101, 0, 0, 101, 7, 7, 101,
                0, 0, 101, 0, 0, 101, 0, 0, 101, 0, 0, 101,
                0, 0, 101, 0, 0, 101, 9, 9, 101, 0, 0, 101,
                0, 0, 101, 0, 0, 101, 0, 0, 101, 0, 0, 101,
                0, 0, 101, 11, 11, 101, 0, 0, 101, 0, 0, 101,
                0, 0, 101, 0, 0, 101, 13, 13, 101, 15, 15, 0,
                0, 0, 0, 0, 0, 0, 17, 17, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 19, 19, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 21, 21, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 23, 23, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 25, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 27, 27, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 29, 29, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 31, 31, 0, 0,
                0, 0, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 35, 35, 0, 0, 0, 0, 0, 0, 0, 37, 37,
                0, 0, 0, 0, 0, 0, 0, 39, 39, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 41, 41, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 43, 43, 0, 0,
                0, 0, 0, 0, 0, 45, 45, 0, 0, 0, 0, 0,
                0, 0, 47, 47, 0, 0, 0, 0, 0, 0, 0, 49,
                49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 51, 51, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 53, 53, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 55, 55, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 57, 57, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                59, 59, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 61, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 63, 63, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 65, 65, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 67, 67, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 69, 69, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 71, 71, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 73, 73, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 75, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                77, 77, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 79, 79, 0, 81, 0, 81, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 83, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 85, 85, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 87,
                87, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 89, 89,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 91, 91, 0,
                93, 93, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 95, 95, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 97, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 99, 101, 101, 101, 101, 101, 101, 101, 101, 101,
                101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101, 101,
                101, 101, 101, 101, 101, 99, 0
        };
    }

    private static byte[] init__http_keywords_to_state_actions_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 1, 0
        };
    }

    private static byte[] init__http_keywords_from_state_actions_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 3, 0
        };
    }

    private static short[] init__http_keywords_eof_trans_0()
    {
        return new short[] {
                0, 0, 0, 0, 0, 0, 1025, 1025, 1025, 1025, 1025, 1025,
                1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025,
                1025, 1025, 1025, 1025, 1025, 1025, 1025, 1025, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 1026
        };
    }

    @SuppressWarnings("unused")
    public static String kw_lookup(byte[] data, int start, int len)
    {
//    String req = null;
        int ts, te, act;

//    int wb = 0;
        int p = start;
        int pe = start + len;
        int eof = pe;
        int cs;
        String kw = null;

// line 972 "HttpRequestParser.java"
        {
            cs = http_keywords_start;
            ts = -1;
            te = -1;
            act = 0;
        }

// line 240 "HttpRequestParser.rl"

// line 982 "HttpRequestParser.java"
        {
            int _klen;
            int _trans = 0;
            int _acts;
            int _nacts;
            int _keys;
            int _goto_targ = 0;

            _goto:
            while (true) {
                switch (_goto_targ) {
                    case 0:
                        if (p == pe) {
                            _goto_targ = 4;
                            continue _goto;
                        }
                        if (cs == 0) {
                            _goto_targ = 5;
                            continue _goto;
                        }
                    case 1:
                        _acts = _http_keywords_from_state_actions[cs];
                        _nacts = (int) _http_keywords_actions[_acts++];
                        while (_nacts-- > 0) {
                            switch (_http_keywords_actions[_acts++]) {
                                case 1:
// line 1 "HttpRequestParser.rl"
                                {
                                    ts = p;
                                }
                                break;
// line 1011 "HttpRequestParser.java"
                            }
                        }

                        _match:
                        do {
                            _keys = _http_keywords_key_offsets[cs];
                            _trans = _http_keywords_index_offsets[cs];
                            _klen = _http_keywords_single_lengths[cs];
                            if (_klen > 0) {
                                int _lower = _keys;
                                int _mid;
                                int _upper = _keys + _klen - 1;
                                while (true) {
                                    if (_upper < _lower) {
                                        break;
                                    }

                                    _mid = _lower + ((_upper - _lower) >> 1);
                                    if (data[p] < _http_keywords_trans_keys[_mid]) {
                                        _upper = _mid - 1;
                                    }
                                    else if (data[p] > _http_keywords_trans_keys[_mid]) {
                                        _lower = _mid + 1;
                                    }
                                    else {
                                        _trans += (_mid - _keys);
                                        break _match;
                                    }
                                }
                                _keys += _klen;
                                _trans += _klen;
                            }

                            _klen = _http_keywords_range_lengths[cs];
                            if (_klen > 0) {
                                int _lower = _keys;
                                int _mid;
                                int _upper = _keys + (_klen << 1) - 2;
                                while (true) {
                                    if (_upper < _lower) {
                                        break;
                                    }

                                    _mid = _lower + (((_upper - _lower) >> 1) & ~1);
                                    if (data[p] < _http_keywords_trans_keys[_mid]) {
                                        _upper = _mid - 2;
                                    }
                                    else if (data[p] > _http_keywords_trans_keys[_mid + 1]) {
                                        _lower = _mid + 2;
                                    }
                                    else {
                                        _trans += ((_mid - _keys) >> 1);
                                        break _match;
                                    }
                                }
                                _trans += _klen;
                            }
                        }
                        while (false);

                    case 3:
                        cs = _http_keywords_trans_targs[_trans];

                        if (_http_keywords_trans_actions[_trans] != 0) {
                            _acts = _http_keywords_trans_actions[_trans];
                            _nacts = (int) _http_keywords_actions[_acts++];
                            while (_nacts-- > 0) {
                                switch (_http_keywords_actions[_acts++]) {
                                    case 2:
// line 1 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                    }
                                    break;
                                    case 3:
// line 177 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Accept-Charset";
                                        }
                                    }
                                    break;
                                    case 4:
// line 178 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Accept-Encoding";
                                        }
                                    }
                                    break;
                                    case 5:
// line 179 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Accept-Language";
                                        }
                                    }
                                    break;
                                    case 6:
// line 180 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Accept-Ranges";
                                        }
                                    }
                                    break;
                                    case 7:
// line 181 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Age";
                                        }
                                    }
                                    break;
                                    case 8:
// line 182 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Allow";
                                        }
                                    }
                                    break;
                                    case 9:
// line 183 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Authorization";
                                        }
                                    }
                                    break;
                                    case 10:
// line 184 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Cache-Control";
                                        }
                                    }
                                    break;
                                    case 11:
// line 185 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Connection";
                                        }
                                    }
                                    break;
                                    case 12:
// line 186 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-Encoding";
                                        }
                                    }
                                    break;
                                    case 13:
// line 187 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-Language";
                                        }
                                    }
                                    break;
                                    case 14:
// line 188 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-Length";
                                        }
                                    }
                                    break;
                                    case 15:
// line 189 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-Location";
                                        }
                                    }
                                    break;
                                    case 16:
// line 190 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-MD5";
                                        }
                                    }
                                    break;
                                    case 17:
// line 191 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-Range";
                                        }
                                    }
                                    break;
                                    case 18:
// line 192 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Content-Type";
                                        }
                                    }
                                    break;
                                    case 19:
// line 193 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Date";
                                        }
                                    }
                                    break;
                                    case 20:
// line 194 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "ETag";
                                        }
                                    }
                                    break;
                                    case 21:
// line 195 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Expect";
                                        }
                                    }
                                    break;
                                    case 22:
// line 196 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Expires";
                                        }
                                    }
                                    break;
                                    case 23:
// line 197 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "From";
                                        }
                                    }
                                    break;
                                    case 24:
// line 198 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Host";
                                        }
                                    }
                                    break;
                                    case 25:
// line 199 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "If-Match";
                                        }
                                    }
                                    break;
                                    case 26:
// line 200 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "If-Modified-Since";
                                        }
                                    }
                                    break;
                                    case 27:
// line 201 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "If-None-Match";
                                        }
                                    }
                                    break;
                                    case 28:
// line 202 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "If-Range";
                                        }
                                    }
                                    break;
                                    case 29:
// line 203 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "If-Unmodified-Since";
                                        }
                                    }
                                    break;
                                    case 30:
// line 204 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Last-Modified";
                                        }
                                    }
                                    break;
                                    case 31:
// line 205 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Location";
                                        }
                                    }
                                    break;
                                    case 32:
// line 206 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Max-Forwards";
                                        }
                                    }
                                    break;
                                    case 33:
// line 207 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Pragma";
                                        }
                                    }
                                    break;
                                    case 34:
// line 208 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Proxy-Authenticate";
                                        }
                                    }
                                    break;
                                    case 35:
// line 209 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Proxy-Authorization";
                                        }
                                    }
                                    break;
                                    case 36:
// line 210 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Range";
                                        }
                                    }
                                    break;
                                    case 37:
// line 211 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Referer";
                                        }
                                    }
                                    break;
                                    case 38:
// line 212 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Retry-After";
                                        }
                                    }
                                    break;
                                    case 39:
// line 213 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Server";
                                        }
                                    }
                                    break;
                                    case 40:
// line 214 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "TE";
                                        }
                                    }
                                    break;
                                    case 41:
// line 215 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Trailer";
                                        }
                                    }
                                    break;
                                    case 42:
// line 216 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Transfer-Encoding";
                                        }
                                    }
                                    break;
                                    case 43:
// line 217 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Upgrade";
                                        }
                                    }
                                    break;
                                    case 44:
// line 218 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "User-Agent";
                                        }
                                    }
                                    break;
                                    case 45:
// line 219 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Vary";
                                        }
                                    }
                                    break;
                                    case 46:
// line 220 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Via";
                                        }
                                    }
                                    break;
                                    case 47:
// line 221 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "Warning";
                                        }
                                    }
                                    break;
                                    case 48:
// line 222 "HttpRequestParser.rl"
                                    {
                                        te = p + 1;
                                        {
                                            kw = "WWW-Authenticate";
                                        }
                                    }
                                    break;
                                    case 49:
// line 176 "HttpRequestParser.rl"
                                    {
                                        te = p;
                                        p--;
                                        {
                                            kw = "Accept";
                                        }
                                    }
                                    break;
                                    case 50:
// line 176 "HttpRequestParser.rl"
                                    {
                                        {
                                            p = ((te)) - 1;
                                        }
                                        {
                                            kw = "Accept";
                                        }
                                    }
                                    break;
// line 1270 "HttpRequestParser.java"
                                }
                            }
                        }

                    case 2:
                        _acts = _http_keywords_to_state_actions[cs];
                        _nacts = (int) _http_keywords_actions[_acts++];
                        while (_nacts-- > 0) {
                            switch (_http_keywords_actions[_acts++]) {
                                case 0:
// line 1 "HttpRequestParser.rl"
                                {
                                    ts = -1;
                                }
                                break;
// line 1284 "HttpRequestParser.java"
                            }
                        }

                        if (cs == 0) {
                            _goto_targ = 5;
                            continue _goto;
                        }
                        if (++p != pe) {
                            _goto_targ = 1;
                            continue _goto;
                        }
                    case 4:
                        if (p == eof) {
                            if (_http_keywords_eof_trans[cs] > 0) {
                                _trans = _http_keywords_eof_trans[cs] - 1;
                                _goto_targ = 3;
                                continue _goto;
                            }
                        }

                    case 5:
                }
                break;
            }
        }

// line 241 "HttpRequestParser.rl"

        return kw;
    }

    // line 1317 "HttpRequestParser.java"
    private static byte[] init__http_date_actions_0()
    {
        return new byte[] {
                0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1,
                5, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10, 1,
                11, 1, 12, 1, 13, 1, 14, 1, 15, 1, 16
        };
    }

    private static short[] init__http_date_key_offsets_0()
    {
        return new short[] {
                0, 0, 5, 6, 7, 9, 18, 20, 21, 22, 25, 28,
                31, 34, 36, 39, 41, 44, 47, 48, 49, 50, 51, 52,
                54, 55, 57, 58, 60, 61, 62, 63, 64, 65, 66, 67,
                70, 74, 83, 85, 86, 87, 90, 93, 96, 99, 101, 104,
                106, 109, 111, 112, 113, 114, 115, 116, 117, 118, 120, 121,
                123, 124, 126, 127, 128, 129, 130, 131, 132, 140, 142, 143,
                144, 146, 147, 148, 149, 150, 151, 153, 154, 156, 157, 159,
                160, 161, 162, 163, 164, 165, 166, 167, 169, 170, 172, 173,
                174, 175, 176, 178
        };
    }

    private static char[] init__http_date_trans_keys_0()
    {
        return new char[] {
                70, 77, 83, 84, 87, 114, 105, 32, 44, 32, 65, 68,
                70, 74, 77, 78, 79, 83, 112, 117, 114, 32, 32, 48,
                57, 32, 48, 57, 32, 48, 57, 58, 48, 57, 48, 57,
                58, 48, 57, 48, 57, 32, 48, 57, 32, 48, 57, 103,
                101, 99, 101, 98, 97, 117, 110, 108, 110, 97, 114, 121,
                111, 118, 99, 116, 101, 112, 32, 32, 48, 57, 32, 45,
                48, 57, 32, 65, 68, 70, 74, 77, 78, 79, 83, 112,
                117, 114, 32, 32, 48, 57, 32, 48, 57, 32, 48, 57,
                58, 48, 57, 48, 57, 58, 48, 57, 48, 57, 32, 48,
                57, 32, 71, 77, 84, 103, 101, 99, 101, 98, 97, 117,
                110, 108, 110, 97, 114, 121, 111, 118, 99, 116, 101, 112,
                65, 68, 70, 74, 77, 78, 79, 83, 112, 117, 114, 45,
                48, 57, 103, 101, 99, 101, 98, 97, 117, 110, 108, 110,
                97, 114, 121, 111, 118, 99, 116, 101, 112, 111, 110, 97,
                117, 116, 104, 117, 117, 101, 101, 100, 48, 57, 0
        };
    }

    private static byte[] init__http_date_single_lengths_0()
    {
        return new byte[] {
                0, 5, 1, 1, 2, 9, 2, 1, 1, 1, 1, 1,
                1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2,
                1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1,
                2, 9, 2, 1, 1, 1, 1, 1, 1, 0, 1, 0,
                1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2,
                1, 2, 1, 1, 1, 1, 1, 1, 8, 2, 1, 1,
                0, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1,
                1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1,
                1, 1, 0, 0
        };
    }

    private static byte[] init__http_date_range_lengths_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
                1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1,
                1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 1, 0
        };
    }

    private static short[] init__http_date_index_offsets_0()
    {
        return new short[] {
                0, 0, 6, 8, 10, 13, 23, 26, 28, 30, 33, 36,
                39, 42, 44, 47, 49, 52, 55, 57, 59, 61, 63, 65,
                68, 70, 73, 75, 78, 80, 82, 84, 86, 88, 90, 92,
                95, 99, 109, 112, 114, 116, 119, 122, 125, 128, 130, 133,
                135, 138, 141, 143, 145, 147, 149, 151, 153, 155, 158, 160,
                163, 165, 168, 170, 172, 174, 176, 178, 180, 189, 192, 194,
                196, 198, 200, 202, 204, 206, 208, 211, 213, 216, 218, 221,
                223, 225, 227, 229, 231, 233, 235, 237, 240, 242, 245, 247,
                249, 251, 253, 255
        };
    }

// line 285 "HttpRequestParser.rl"

    private static byte[] init__http_date_trans_targs_0()
    {
        return new byte[] {
                2, 89, 91, 93, 96, 0, 3, 0, 4, 0, 5, 34,
                0, 5, 6, 19, 21, 23, 26, 28, 30, 32, 0, 7,
                18, 0, 8, 0, 9, 0, 9, 10, 0, 11, 10, 0,
                11, 12, 0, 13, 12, 0, 14, 0, 15, 14, 0, 16,
                0, 17, 16, 0, 17, 98, 0, 8, 0, 20, 0, 8,
                0, 22, 0, 8, 0, 24, 25, 0, 8, 0, 8, 8,
                0, 27, 0, 8, 8, 0, 29, 0, 8, 0, 31, 0,
                8, 0, 33, 0, 8, 0, 35, 0, 35, 36, 0, 37,
                68, 36, 0, 37, 38, 53, 55, 57, 60, 62, 64, 66,
                0, 39, 52, 0, 40, 0, 41, 0, 41, 42, 0, 43,
                42, 0, 43, 44, 0, 45, 44, 0, 46, 0, 47, 46,
                0, 48, 0, 49, 48, 0, 49, 50, 0, 51, 0, 99,
                0, 40, 0, 54, 0, 40, 0, 56, 0, 40, 0, 58,
                59, 0, 40, 0, 40, 40, 0, 61, 0, 40, 40, 0,
                63, 0, 40, 0, 65, 0, 40, 0, 67, 0, 40, 0,
                69, 74, 76, 78, 81, 83, 85, 87, 0, 70, 73, 0,
                71, 0, 72, 0, 42, 0, 71, 0, 75, 0, 71, 0,
                77, 0, 71, 0, 79, 80, 0, 71, 0, 71, 71, 0,
                82, 0, 71, 71, 0, 84, 0, 71, 0, 86, 0, 71,
                0, 88, 0, 71, 0, 90, 0, 4, 0, 92, 90, 0,
                4, 0, 94, 95, 0, 4, 0, 4, 0, 97, 0, 4,
                0, 98, 0, 0, 0
        };
    }

    private static byte[] init__http_date_trans_actions_0()
    {
        return new byte[] {
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 17, 0, 0, 0, 0, 1, 0, 0, 1, 0,
                0, 5, 0, 0, 5, 0, 7, 0, 0, 7, 0, 9,
                0, 0, 9, 0, 0, 3, 0, 25, 0, 0, 0, 33,
                0, 0, 0, 13, 0, 0, 0, 0, 11, 0, 23, 21,
                0, 0, 0, 15, 19, 0, 0, 0, 31, 0, 0, 0,
                29, 0, 0, 0, 27, 0, 0, 0, 0, 1, 0, 0,
                0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 17, 0, 0, 0, 0, 3, 0, 0,
                3, 0, 0, 5, 0, 0, 5, 0, 7, 0, 0, 7,
                0, 9, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0,
                0, 25, 0, 0, 0, 33, 0, 0, 0, 13, 0, 0,
                0, 0, 11, 0, 23, 21, 0, 0, 0, 15, 19, 0,
                0, 0, 31, 0, 0, 0, 29, 0, 0, 0, 27, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                17, 0, 0, 0, 3, 0, 25, 0, 0, 0, 33, 0,
                0, 0, 13, 0, 0, 0, 0, 11, 0, 23, 21, 0,
                0, 0, 15, 19, 0, 0, 0, 31, 0, 0, 0, 29,
                0, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 3, 0, 0, 0
        };
    }

    public static long parseDate(byte[] data, int pos, int len)
    {
        int p = 0;
        int pe = len;
//    int eof = pe;
        int cs;
//    int wkday = 0;
        int day = 0, month = 0, year = 0;
        int hh = 0, mm = 0, ss = 0;

// line 1510 "HttpRequestParser.java"
        {
            cs = http_date_start;
        }

// line 299 "HttpRequestParser.rl"

// line 1517 "HttpRequestParser.java"
        {
            int _klen;
            int _trans = 0;
            int _acts;
            int _nacts;
            int _keys;
            int _goto_targ = 0;

            _goto:
            while (true) {
                switch (_goto_targ) {
                    case 0:
                        if (p == pe) {
                            _goto_targ = 4;
                            continue _goto;
                        }
                        if (cs == 0) {
                            _goto_targ = 5;
                            continue _goto;
                        }
                    case 1:
                        _match:
                        do {
                            _keys = _http_date_key_offsets[cs];
                            _trans = _http_date_index_offsets[cs];
                            _klen = _http_date_single_lengths[cs];
                            if (_klen > 0) {
                                int _lower = _keys;
                                int _mid;
                                int _upper = _keys + _klen - 1;
                                while (true) {
                                    if (_upper < _lower) {
                                        break;
                                    }

                                    _mid = _lower + ((_upper - _lower) >> 1);
                                    if (data[p] < _http_date_trans_keys[_mid]) {
                                        _upper = _mid - 1;
                                    }
                                    else if (data[p] > _http_date_trans_keys[_mid]) {
                                        _lower = _mid + 1;
                                    }
                                    else {
                                        _trans += (_mid - _keys);
                                        break _match;
                                    }
                                }
                                _keys += _klen;
                                _trans += _klen;
                            }

                            _klen = _http_date_range_lengths[cs];
                            if (_klen > 0) {
                                int _lower = _keys;
                                int _mid;
                                int _upper = _keys + (_klen << 1) - 2;
                                while (true) {
                                    if (_upper < _lower) {
                                        break;
                                    }

                                    _mid = _lower + (((_upper - _lower) >> 1) & ~1);
                                    if (data[p] < _http_date_trans_keys[_mid]) {
                                        _upper = _mid - 2;
                                    }
                                    else if (data[p] > _http_date_trans_keys[_mid + 1]) {
                                        _lower = _mid + 2;
                                    }
                                    else {
                                        _trans += ((_mid - _keys) >> 1);
                                        break _match;
                                    }
                                }
                                _trans += _klen;
                            }
                        }
                        while (false);

                        cs = _http_date_trans_targs[_trans];

                        if (_http_date_trans_actions[_trans] != 0) {
                            _acts = _http_date_trans_actions[_trans];
                            _nacts = (int) _http_date_actions[_acts++];
                            while (_nacts-- > 0) {
                                switch (_http_date_actions[_acts++]) {
                                    case 0:
// line 254 "HttpRequestParser.rl"
                                    {
                                        day = day * 10 + (data[p] - 48);
                                    }
                                    break;
                                    case 1:
// line 255 "HttpRequestParser.rl"
                                    {
                                        year = year * 10 + (data[p] - 48);
                                    }
                                    break;
                                    case 2:
// line 256 "HttpRequestParser.rl"
                                    {
                                        hh = hh * 10 + (data[p] - 48);
                                    }
                                    break;
                                    case 3:
// line 257 "HttpRequestParser.rl"
                                    {
                                        mm = mm * 10 + (data[p] - 48);
                                    }
                                    break;
                                    case 4:
// line 258 "HttpRequestParser.rl"
                                    {
                                        ss = ss * 10 + (data[p] - 48);
                                    }
                                    break;
                                    case 5:
// line 262 "HttpRequestParser.rl"
                                    {
                                        month = 0;
                                    }
                                    break;
                                    case 6:
// line 263 "HttpRequestParser.rl"
                                    {
                                        month = 1;
                                    }
                                    break;
                                    case 7:
// line 264 "HttpRequestParser.rl"
                                    {
                                        month = 2;
                                    }
                                    break;
                                    case 8:
// line 265 "HttpRequestParser.rl"
                                    {
                                        month = 3;
                                    }
                                    break;
                                    case 9:
// line 266 "HttpRequestParser.rl"
                                    {
                                        month = 4;
                                    }
                                    break;
                                    case 10:
// line 267 "HttpRequestParser.rl"
                                    {
                                        month = 5;
                                    }
                                    break;
                                    case 11:
// line 268 "HttpRequestParser.rl"
                                    {
                                        month = 6;
                                    }
                                    break;
                                    case 12:
// line 269 "HttpRequestParser.rl"
                                    {
                                        month = 7;
                                    }
                                    break;
                                    case 13:
// line 270 "HttpRequestParser.rl"
                                    {
                                        month = 8;
                                    }
                                    break;
                                    case 14:
// line 271 "HttpRequestParser.rl"
                                    {
                                        month = 90;
                                    }
                                    break;
                                    case 15:
// line 272 "HttpRequestParser.rl"
                                    {
                                        month = 10;
                                    }
                                    break;
                                    case 16:
// line 273 "HttpRequestParser.rl"
                                    {
                                        month = 11;
                                    }
                                    break;
// line 1664 "HttpRequestParser.java"
                                }
                            }
                        }

                    case 2:
                        if (cs == 0) {
                            _goto_targ = 5;
                            continue _goto;
                        }
                        if (++p != pe) {
                            _goto_targ = 1;
                            continue _goto;
                        }
                    case 4:
                    case 5:
                }
                break;
            }
        }

// line 300 "HttpRequestParser.rl"

        if (year < 100) {
            year += 1900;
        }

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day, hh, mm, ss);
        gc.setTimeZone(GMT);
        return gc.getTimeInMillis();
    }

    public static void main(String args[])
            throws Exception
    {
        /// Testing
        String s =
                "GET /favicon.ico#test HTTP/1.1\r\n" +
                        "Host: localhost:7262\r\n" +
                        "User-Agent: Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.5; en-US; rv:1.9.0.10) Gecko/2009042315 Firefox/3.0.10 Ubiquity/0.1.5\r\n" +
                        "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" +
                        "Accept-Language: en-us,en;q=0.5\r\n" +
                        "Accept-Encoding: gzip,deflate\r\n" +
                        "Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.7\r\n" +
                        "Keep-Alive: 300\r\n" +
                        "Connection: keep-alive\r\n\r\n";
        System.out.println("Input Request: (" + s.length() + " bytes)");
        System.out.println(s);
        byte[] data = s.getBytes();
        int len = data.length;

        System.out.println("=============================================================");
        HttpRequest req = new HttpRequest();
        req.buffer = ByteBuffer.allocate(2048);
        req.buffer.put(data);
        initHeader(req, len);
        System.out.println(req);
    }
}

