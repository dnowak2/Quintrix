package readdata;

public class ReadData 
{
	public void ReadData(String filePath, int byteCount)
	{
		byte[] buffer = new byte[byteCount];
		using (FileStream fs = new FileStream(filePath, FileMode.Open))
		{
			fs.Read(buffer, 0, byteCount);
		}
	}
}
