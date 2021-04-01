package enums;

public enum AminoAcids {
    Met, Phe, Leu, Ser, Tyr, Cys, Trp, Pro, His, Gln, Arg, Ile, Thr, Asn, Lys, Val, Ala, Asp, Glu, Gly, Stop;

    @Override
    public String toString() {
        switch(this){
			case Ala:
			    return "Ala ";	
			case Arg:
                return "Arg ";
			case Asn:
				return "Asn ";
			case Asp:
				return "Asp ";
			case Cys:
                return "Cys ";
			case Gln:
				return "Gln ";
			case Glu:
				return "Glu ";
			case Gly:
				return "Gly ";
			case His:
				return "His ";
			case Ile:
				return "Ile ";
			case Leu:
				return "Leu ";
			case Lys:
				return "Lys ";
			case Met:
				return "Met ";
			case Phe:
				return "Phe ";
			case Pro:
				return "Pro ";
			case Ser:
				return "Ser ";
			case Stop:
				return "Stop ";
			case Thr:
				return "Thr ";
			case Trp:
				return "Trp ";
			case Tyr:
				return "Tyr ";
			case Val:
				return "Val ";
			default:
				return null;
        }
            
    }

    public String convert(String codon){

            switch (codon) {
                case "UUU":
                    return Phe.toString();
                case "UUC":
                    return Phe.toString();
                case "UUA":
                    return Leu.toString();
                case "UUG":
                    return Leu.toString();
                case "UCU":
                    return Ser.toString();
                case "UCC":
                    return Ser.toString();
                case "UCA":
                    return Ser.toString();
                case "UCG":
                    return Ser.toString();
                case "UAU":
                    return Tyr.toString();
                case "UAC":
                    return Tyr.toString();
                case "UAA":
                    return Stop.toString();
                case "UAG":
                    return Stop.toString();
                case "UGU":
                    return Cys.toString();
                case "UGC":
                    return Cys.toString();
                case "UGA":
                    return Stop.toString();
                case "UGG":
                    return Trp.toString();
                case "CUU":
                    return Leu.toString();
                case "CUC":
                    return Leu.toString();
                case "CUA":
                    return Leu.toString();
                case "CUG":
                    return Leu.toString();
                case "CCU":
                    return Pro.toString();
                case "CCC":
                    return Pro.toString();
                case "CCA":
                    return Pro.toString();
                case "CCG":
                    return Pro.toString();
                case "CAU":
                    return His.toString();
                case "CAC":
                    return His.toString();
                case "CAA":
                    return Gln.toString();
                case "CAG":
                    return Gln.toString();
                case "CGU":
                    return Arg.toString();
                case "CGC":
                    return Arg.toString();
                case "CGA":
                    return Arg.toString();
                case "CGG":
                    return Arg.toString();
                case "AUU":
                    return Ile.toString();
                case "AUC":
                    return Ile.toString();
                case "AUA":
                    return Met.toString();
                case "AUG":
                    return Met.toString();
                case "ACU":
                    return Thr.toString();
                case "ACC":
                    return Thr.toString();
                case "ACA":
                    return Thr.toString();
                case "ACG":
                    return Thr.toString();
                case "AAU":
                    return Asn.toString();
                case "AAC":
                    return Asn.toString();
                case "AAA":
                    return Lys.toString();
                case "AAG":
                    return Lys.toString();
                case "AGU":
                    return Ser.toString();
                case "AGC":
                    return Ser.toString();
                case "AGA":
                    return Arg.toString();
                case "AGG":
                    return Arg.toString();
                case "GUU":
                    return Val.toString();
                case "GUC":
                    return Val.toString();
                case "GUA":
                    return Val.toString();
                case "GUG":
                    return Val.toString();
                case "GCU":
                    return Ala.toString();
                case "GCC":
                    return Ala.toString();
                case "GCA":
                    return Ala.toString();
                case "GCG":
                    return Ala.toString();
                case "GAU":
                    return Asp.toString();
                case "GAC":
                    return Asp.toString();
                case "GAA":
                    return Glu.toString();
                case "GAG":
                    return Glu.toString();
                case "GGU":
                    return Gly.toString();
                case "GGC":
                    return Gly.toString();
                case "GGA":
                    return Gly.toString();
                case "GGG":
                    return Gly.toString();
               default:
                   return "null";
   }

    }
}
