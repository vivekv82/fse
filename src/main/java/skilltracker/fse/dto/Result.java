package skilltracker.fse.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Builder;

@Builder
@Data
public class Result implements Serializable {
	
	private static final long serialVersionUID = -2211832491775352290L;
	private String result;
	private String errorMessage;
	private String errorCode;

	public Result(String result, String errorMessage, String errorCode) {
		this.result = result;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
